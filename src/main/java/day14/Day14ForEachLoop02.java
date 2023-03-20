package day14;

import java.util.Arrays;
import java.util.Comparator;

public class Day14ForEachLoop02 {
    public static void main(String[] args) {

        //Sort the array element accrding to their lengths
        //["Michael","Ali","Maria","Veli"]
        String arr[]={"Michael","Ali","Maria","Veli"};
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));

        //Sort the array element accrding to their lengthsaccording the descending order
        //["Michael","Ali","Maria","Veli"]

        String brr[] ={"Jackson","Tom","Ali","Suatin","Veli"};
        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));

        //Sort the array element accrding to their lengthsaccording the descending order
        //iF SOME elements are in the same lenggth put them in alphabetic order
        //["Jack","Mark","Adam","Jackson","Marry","Junior thomson"]
        String crr [] = {"Jack","Mark","Adam","Jackson","Marry","Junior Thomson"};
        Arrays.sort(crr ,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr));
    }
}
