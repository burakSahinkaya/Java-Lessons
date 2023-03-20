package day27;

import java.util.TreeMap;

public class TreeMap01 {
    /*
    1) treeMap is not thread safe and not synchronized
    2)TreeMap puts the elements in natural order according to the keys
    3)TreeMap does not accept "null" in key part
    4)TreeMap excepts multiple "null" in value part
    5)TreeMap is the slowest map
     */
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(103,"Tom");
        tm.put(105,"Hanks");
        tm.put(104,"Tom Hanks");

        tm.put(102,null);//In value part null is excaptable

        System.out.println(tm);
    }
}
