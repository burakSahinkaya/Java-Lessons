package day27;

import java.util.Hashtable;

public class HashTable01 {
    /*
    1) HashTable is thread-safe and synchronized
    2)HashTable puts the elements in random order
    3)HashTable does not allow using "null" neither in key nor value
    4)HashTable is slower than HashMap
     */

    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<>();

        ht.put("Tom",3);
        ht.put("Hanks",5);

        //ht.put(null,0); //NullPointerException


        System.out.println(ht);

    }
}
