package Java;

public class array_secondlargest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int temp = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }


            }

        }
        System.out.println("THE SECOND LARGEST NUMBER IS" +a[1]);
    }
}
