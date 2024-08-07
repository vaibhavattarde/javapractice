package Java;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("ENTER THE NUMBER");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("PRIME NO");

        } else {
            System.out.println("NOT A PRIME NO");
        }

    }
}
