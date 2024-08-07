package Java;

public class Code {
    public static void main(String[] args) {
        String Name1="Vaibhav";
        String Name2="Attarde";
        System.out.println(Name1.length()+Name2.length()+"  "+"Total Alphabate");
        System.out.println(Name1.toUpperCase()+ "  "+"UpperCase");
        System.out.println(Name1.toLowerCase()+ "  "+"LowerCase");
        System.out.println(Name1.concat(Name2));
       boolean ans= Name1.contentEquals(Name2);
        System.out.println(ans);

        //replace
        System.out.println(Name1.replace('v','a'));


    }

    }
