package day14;

import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop04 {
    public static void main(String[] args) {

        //Find the longest word in a String
        String sentence= "Java1234 is easy if you study. Actually nothing is easy if you do no study.";
        String sentecWithoutP= sentence.replaceAll("[^A-Za-z0-9 ]","");

        String arr[]=sentecWithoutP.split(" ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());


        //How to see all the longest  elements if there are many
        for(String w : arr){
            if(w.length()==arr[0].length()){
                System.out.print(" "+w);
            }
        }


    }
}
