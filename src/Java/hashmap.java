package Java;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
//        HashMap<Integer,String> HM = new HashMap<Integer , String>();
//        //ADD
//        HM.put(101 ,"vaibhav");
//        HM.put(102,"Attarde");
//        HM.put(103 ,"Sagar");
//        HM.put(104,"Dhonde");
//        System.out.println(HM);
//        System.out.println("=============================");
//        //UPDATE
//        HM.put(104,"PANKAJ");
//        System.out.println(HM);
//        System.out.println("=============================");
//        //REMOVE
//        HM.remove(101,"vaibhav");
//        System.out.println(HM);
//        System.out.println("=============================");
//        //RETRIVE
//        for ( Map.Entry<Integer ,String> data:HM.entrySet())
//        {
//            System.out.println(data);
//            System.out.println(data.getKey());
//            System.out.println(data.getValue());
//        }
//
//    }
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Vaibhav", 100);
        hm.put("Attarde", 200);
        System.out.println(hm);
        hm.put("Vaibhav",300);
        System.out.println(hm);//update
        hm.remove("Attarde",200);
        System.out.println(hm);
        for ( Map.Entry<String, Integer> data:hm.entrySet())
        {
            System.out.println(data);
            System.out.println(data.getKey());
            System.out.println(data.getValue());
        }
    }
}

