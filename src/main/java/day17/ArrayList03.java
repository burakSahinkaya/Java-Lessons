package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        /*
        Count the words in a String one by one
        String is "Ali came to school and Ayse came to schoo"
        Ali, came=2 , to= 2 , school = 2 , abd = 1, Ayse = 1
         */
        String sentence =  "Ali came to came school, and Ayse came to school.";
        String withOutPunct = sentence.replaceAll("[^A-Za-z0-9 ]","");

        String arr[] = withOutPunct.split(" ");
        System.out.println(Arrays.toString(arr));

        List<String> arrList = new ArrayList<>();
        for(String w : arr){
            arrList.add(w);
        }

        String word = "";
        int counter = 1;

        for(int i=0;i<arrList.size();i++){
            word = arrList.get(i);
            for(int k = i+1 ; k<arrList.size();k++){
                if(word.equals(arrList.get(k))){
                    counter++;
                    arrList.remove(k);
                    k--;
                }
            }
            System.out.println(word + " = "+ counter);
            counter=1;
        }


    }
}
