package Java;

import java.util.Scanner;

public class Fibannoci {
    public static void main(String[] args) {
//        int term, a = 0, b = 1, c;
//        System.out.println("Enter the term");
//        Scanner r = new Scanner(System.in);
//        term = r.nextInt();
//        for (int i = 1; i <= term; i++) {
//            System.out.print(a + " ");
//            c = a + b;
//            a = b;
//            b = c;
//        }
        int term, a = 0, b = 1, c = 1, d;
        System.out.println("ENTER THE TERM ");
        Scanner sc = new Scanner(System.in);
        term = sc.nextInt();
        for (int i = 1; i <= term; i++) {
            System.out.print(a + " ");
            d = a + b + c;
            a = b;
            b = c;
            c = d;


        }
    }
}

