import java.util.Scanner;

public class pasical {
    public static int combination(int n, int r) {
        if ((n == r) || (r == 0)) {
            return 1;
        } else {
            return combination(n - 1, r - 1) + combination(n - 1, r); // FIXED here
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int result = combination(n, r);
        System.out.println("C(" + n + ", " + r + ") = " + result);
    }
}



