package Java;

public class arrayManipulation_weekname {
    public static void main(String[] args) {
        String [] input = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        String [] output = new String[input.length];
        for (int i = 0; i <input.length ; i++) {
            output[i]=input[i].substring(0,3);

        }
        for (String day:output) {
            System.out.println(day);

        }

    }
}
