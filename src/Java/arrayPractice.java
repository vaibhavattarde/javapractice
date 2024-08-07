package Java;

public class arrayPractice {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int sum =0;
        int max=a[0];
        int min =a[0];



        for (int i = 0; i <=a.length-1; i++)
        {
            sum = sum+a[i];

        }
        System.out.println("Addition is" +" " +sum ); // sum
        System.out.println("Average is" +" " +sum/a.length ); //avg
        for (int i = 1; i <a.length ; i++) {
            if (max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("max value is" +" "+max);
        for (int i = 0; i <a.length ; i++) {
            if ((min>a[i]))
            {
                min=a[i];

            }

        }
        System.out.println(min);
    }

}

