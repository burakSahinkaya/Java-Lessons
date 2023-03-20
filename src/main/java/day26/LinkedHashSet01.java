package day26;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

    /*
    1) LinkedHashSet puts the element in insertion order
     */
    public static void main(String[] args) {
        LinkedHashSet<String> lhSet = new LinkedHashSet<>();

        lhSet.add("A");
        lhSet.add("BFED");
        lhSet.add("ZK");
        lhSet.add("M");
        lhSet.add("KLM12");
        lhSet.add("?");
        lhSet.add(null);
        System.out.println(lhSet);


    }

}
