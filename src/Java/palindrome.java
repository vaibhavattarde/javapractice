package Java;

public class palindrome {
    public static void main(String[] args) {
        int num =121;
        int temp = num;
        int rev=0,rem;
        while (temp!=0)
        {
          rem=temp%10;
          rev = rev*10+rem;
          temp = temp/10;

        }
        if ( rev==num)
        {
            System.out.println(num + " number is plaindrome");
        }
        else
        {
            System.out.println(num + " number is not palindrome");
        }
    }
}
