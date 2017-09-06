package Kolekcje;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        // map1.put(null, null);
        map1.put(1, "Pies");
        map1.put(null, "Lama");


        Map<Integer, String> map2 = new TreeMap<>();
        map1.put(1, "Pies");
        map1.put(null, "Lama");


//        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
//            System.out.println(entry);
//        }
//        System.out.println();

        for (Map.Entry<Integer, String> entry2 : map2.entrySet()) {
            System.out.println(entry2);
        }

    }

}

