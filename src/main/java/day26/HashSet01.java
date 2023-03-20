package day26;

import java.util.HashSet;

public class HashSet01 {

    /*
   1) When you see the word "Set" in java it means no repeated elements,all elements are unique
   2) "Set" is interface and it has 3 concrete child classes
       i)HashSet    ii)linkedHashSet    iii)TreeSet

     i)HashSet
        a)It is the fastest set
        b)It does not put any elements in any order, elements will be in random order
        c)All elements are unique in Hashset
        d)HashSet allows using just a single "null" elements
     */

    public static void main(String[] args) {
        HashSet<String> hSet = new HashSet<>();
        hSet.add("A");
        hSet.add("H");
        hSet.add("Y");
        hSet.add("B");
        hSet.add("M");
        hSet.add("Z");
        hSet.add(null);
        System.out.println(hSet);



    }

}
