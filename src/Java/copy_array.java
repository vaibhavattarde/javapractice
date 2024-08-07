package Java;

import java.util.Scanner;

public class copy_array {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first array value");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("first array element");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] + " ");

        }
        System.out.println("second array element");
        for (int i = 0; i < 5; i++) {
            int[] b = new int[5];
            b[i] = a[i];
            System.out.println(b[i] + " ");

        }


    }

}
