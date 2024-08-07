package Java;

public class array_operation {
    public static void main(String[] args) {
        int[] ar= new int[3];
        ar[0]=1;
        ar[1]=2;
        ar[2]=4;
       //ar[3]=5; ARRAY OUT OF BOUND EXCEPTION
        for (int i = 0; i <ar.length ; i++) {
            System.out.println(ar[i]);

        }

    }
}
