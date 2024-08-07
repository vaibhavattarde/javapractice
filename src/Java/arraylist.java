package Java;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Vaibhav");
        al.add("Attarde");
        al.add("1");
        al.add("2");
        //sorting
        Collections.sort(al);
        System.out.println(al);
        System.out.println("=========================");
        //reverse sorting
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
        System.out.println("=========================");

        class ArrayRotation {
            public  void main(String[] args) {
                int[] list = {1, 2, 3, 4, 5};

                rotateRight(list);

                // Print the result
                for (int num : list) {
                    System.out.print(num + " ");
                }
            }

            public  void rotateRight(int[] arr) {
                if (arr.length > 0) {
                    int lastElement = arr[arr.length - 1];

                    // Shift elements to the right
                    for (int i = arr.length - 1; i > 0; i--) {
                        arr[i] = arr[i - 1];


                    }
                }
            }
        }
    }
}
