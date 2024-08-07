package Java;

public class objectComparison {
    public static void main(String[] args) {
        Double x = new Double(1234.89);
        Long y = new Long(1234566);
        System.out.println(x.equals(y)+" " +"Objects are not equal hence it is false ");
        System.out.println(x.equals(1234.89) +" "+ "Objects are equal hence it is true");
    }
}
