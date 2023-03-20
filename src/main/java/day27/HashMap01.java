package day27;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {


        Map<String, Integer> hMap = new HashMap<>();

        //Type code to find the number of occurrences of letters in a String
        // 1) Removes punctuation marks and spaces and numbers and digits and symbol
        // 2) Get the characters one by one
        // 3) Count the occurences

        //1.
        String sentence ="13, toms are phantom?";
        String clearSentence = sentence.replaceAll("[^A-Za-z]","");
        System.out.println(clearSentence);

        //2.
        String[] letters =  clearSentence.split("");
        System.out.println(Arrays.toString(letters));//[t, o, m, s, a, r, e, p, h, a, n, t, o, m]

        //3.
        Map<String,Integer> result = new HashMap<>();

       for(String w : letters){
           Integer numOfOccur = result.get(w);
           if(numOfOccur == null){
               result.put(w,1);
           }else{
               result.put(w,numOfOccur+1);
           }
       }
        System.out.println(result);

    }
}
