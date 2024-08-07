package Java;

import java.util.Scanner;

public class fACTORIAL {
    public static void main(String[] args) {
        int n,fact=1;
        System.out.println("ENTER A NO");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
           fact=fact*i;

        }
        System.out.println(fact);

    }
}
