import java.util.Scanner;

import java.util.Scanner;

public class num {
    public static int sumn(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if (i % k != 0 && sumn(i) % k == 0) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
