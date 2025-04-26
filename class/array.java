import java.util.Scanner;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int size = sc.nextInt();
        int[] a = new int[size];

        // Input array elements
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        // Print original array
        System.out.print("Original array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int rot = sc.nextInt();
        int nr = rot % size;

        
        for (int r = 0; r < nr; r++) {
            int temp = a[size - 1];
            for (int i = size - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = temp;
        }

       
        System.out.print("Rotated array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}
