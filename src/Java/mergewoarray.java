package Java;

import java.util.Arrays;

public class mergewoarray {
    public static void main(String[] args) {
            {
//
//                int[] a = { 10, 20, 30, 40 };
//
//
//                int[] b = { 50, 60, 70, 80 };
//
//
//                int a1 = a.length;
//
//
//                int b1 = b.length;
//
//
//                int c1 = a1 + b1;
//
//
//                int[] c = new int[c1];
//
//                System.arraycopy(a,0,c,0,a1);
//                System.arraycopy(b,0,c,a1,b1);
//
//                  System.out.println(Arrays.toString(c));
                int a[]={1,2,4,5};
                int b[]={6,7,8,9};
                int a1=a.length;
                int b1 =b.length;
                int c1 = a1+b1;
                 int []c = new int[c1];
                 System.arraycopy(a,0,c,0,a1);
                 System.arraycopy(b,0,c,a1,b1);
                System.out.println(Arrays.toString(c));



            }
        }

    }

