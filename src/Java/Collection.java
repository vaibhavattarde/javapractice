package Java;

import java.util.ArrayList;
import java.util.Stack;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Vaibhav");
        arrayList.add("Attarde");
        System.out.println(arrayList );
        arrayList.add(1,"Pravinchandra");
        System.out.println(arrayList);
        arrayList.add(0,"Name");
        System.out.println(arrayList);
        arrayList.remove("Name");
        System.out.println(arrayList );
        arrayList.set(0,"VAIBHAV");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
       // System.out.println();
        arrayList.remove(1);
        System.out.println(arrayList);
        for (String s:arrayList
             )
        {
            System.out.println(s);
        }

    }

}
