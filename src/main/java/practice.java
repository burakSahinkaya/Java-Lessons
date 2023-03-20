import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice {

    public static void main(String[] args) {
        //Type code to find the number of occurrences of letters in a String
        // 1) Removes punctuation marks and spaces and numbers and digits and symbol
        // 2) Get the characters one by one
        // 3) Count the occurences
        String sentence = "This is one solution. If you want to make it more generic, you can use";
       String clearSentence = sentence.replaceAll("[^A-Za-z]","");
       String arr[] = clearSentence.split("");

       Map<String,Integer> resuklt = new HashMap<>();

       for(String w: arr){
           Integer numOfOccur = resuklt.get(w);
           if(numOfOccur == null){
               resuklt.put(w,1);
           }else{
               resuklt.put(w,numOfOccur+1);
           }
       }
        System.out.println(resuklt);
    }
}
