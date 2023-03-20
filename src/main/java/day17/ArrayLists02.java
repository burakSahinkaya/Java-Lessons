package day17;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists02 {
    public static void main(String[] args) {
        /*
        From a give array find all pairs whose sum is a given number
        {4,6,5,-10,8,5,20} ==> 10
        for example
         */
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(4);
        aList.add(6);
        aList.add(5);
        aList.add(-10);
        aList.add(8);
        aList.add(5);
        aList.add(20);
        Collections.sort(aList);



        for(int i = 0; i < aList.size();i++){
            for(int j = i+1; j<aList.size();j++){
                if(aList.get(i)+ aList.get(j) == 10){
                    System.out.println(aList.get(i)+" - " +aList.get(j));
                }
            }
        }


    }
}
