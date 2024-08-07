package Java;

public class array_largest_smallest {
    public static void main(String[] args) {
        int [] number = {2,4,5,6};
        int smallest = number[0];
        int largest = number[0];
        for (int i = 0; i <number.length ; i++) {
            if (number[i]>largest)
            {
                largest=number[i];
            } else if (number[i]<smallest) {
                smallest=number[i];
                
            }
        }
        System.out.println("The smallest number is "+ smallest);
        System.out.println("The Largest number is " + largest);
    }
}
