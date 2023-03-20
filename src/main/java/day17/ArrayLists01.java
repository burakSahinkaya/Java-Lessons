package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //find the closest 2 given intiger in the give list [12,15,10,11,20]
        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(15);
        al.add(10);
        al.add(11);
        al.add(20);

        //Sort the list elements
        Collections.sort(al);
        System.out.println(al);

        //sellect a min dif value
         int mindiff = al.get(1)-al.get(0);
         for(int i = 2; i<al.size();i++){
            mindiff = Math.min(mindiff, al.get(i)-al.get(i-1));

            }
         for(int i =1;i<al.size();i++){
             if(al.get(i)-al.get(i-1)==mindiff){
                 System.out.println(al.get(i)+" - "+ al.get(i-1));
             }
         }



    }
}
