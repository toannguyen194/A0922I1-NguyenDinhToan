package loop;

import java.util.Scanner;

public class hien_thi_20_so_nguyen_dau_tien {
    public static void main(String[] args) {
        int number;
        int count = 0;
        int n = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers of primes : ");
        number = scanner.nextInt();
        while (count < number) {
            int divisor = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisor++;
                }
            }
            if (divisor == 2) {
                count++;
                System.out.printf(n + "  ");
            }
            n++;
        }
    }
}

