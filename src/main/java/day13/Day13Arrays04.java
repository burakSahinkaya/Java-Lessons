package day13;

import java.util.Arrays;

public class Day13Arrays04 {
    public static void main(String[] args) {

        //Create an integer array and print all the elements less then 5
        //[12, 3, -3, 5, 23] ==> 3, -3
        int arr[] = {12, 3, -3, 5, 23};

        //1. way: user regular loops (do while - for - while)
        int i=0;
        while(i<arr.length){

            if(arr[i]<5){
                System.out.print(arr[i]+", ");
            }
            i++;
        }
        System.out.println();
        //2.way : use for each loop (Enhanced loop)(can be used just with arrays and collection
        for(int w : arr){
            if(w<5){
                System.out.print(w+", ");
            }
        }
    }
}
