package Java;

public class ReverseString {

    public static void main(String[] args) {
//        String Orignial = "Vaibhav Attarde";
//        String Reverse = new StringBuilder(Orignial).reverse().toString().toLowerCase();
//        System.out.println(Reverse);
        String name = "vaibhav attarde";
        for(int i =name.length()-1 ; i>=0  ;i--)
        {
            System.out.print(name.charAt(i));
        }

        String name2 ="vaibhavattarde";
        for(int i =name2.length()-1;i>=0;i--)
        {
            System.out.print(name2.charAt(i));
        }
        int i=20;
        while(i<=20)
        {
            i++;
            System.out.println(i);
        }

        int [] arr={2,3,5,6};
        for (int a : arr)
        {
            System.out.println(a);
        }



    }





}