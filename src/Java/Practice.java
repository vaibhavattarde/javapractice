package Java;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        logic(arr);
        for (int element : arr) {
            System.out.println(element);
        }
       ;
    }

    public static void logic(int[] arr) {
        if (arr.length > 0)
        {
            for (int i = arr.length - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
    }
}
