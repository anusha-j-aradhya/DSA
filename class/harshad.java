
import java.util.Scanner;

import java.util.Scanner;

public class harshad {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int digitSum = sumOfDigits(i);
            if (i % digitSum == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}