package Java;

import java.util.ArrayList;
import java.util.Arrays;

public class java2411 {

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5,8};
        rotate(list);
        {
            for (int num : list) {
                System.out.print(num + " ");
            }
        }
    }
    public static  void rotate(int[] arr) {
        if (arr.length > 0)
        {

            for (int i = arr.length - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;

            }

        }
    }
}
