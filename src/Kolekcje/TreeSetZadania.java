package Kolekcje;

import java.util.Set;

class TreeSet {
    public static void main(String[] args) {

        Set<String> set1 = new java.util.TreeSet<>();
        set1.add("Kowalski");
        set1.add("Baranowski");
        set1.add("Zlotnicki");
        set1.add("Adamski");

        for (String s : set1) {
            System.out.println(s);
        }
    }


}
