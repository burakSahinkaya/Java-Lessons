package day13;

import java.util.Arrays;

public class Day13Arrays01 {
    public static void main(String[] args) {

        //type code to print the sum of the min and max value of integer array

        int arr[] = {23,12,34,10,78,19};
        System.out.println(Arrays.toString(arr));

        //put the elemetns in ascending order
        //sort() method in array class puts the elements is ascneding order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int minValue = arr[0];
        int maxValue = arr[arr.length-1];
        System.out.println(maxValue+minValue);
    }
}
