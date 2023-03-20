package day14;

import java.util.Arrays;

public class Day14ForEachLoop01 {
    public static void main(String[] args) {

        //type code to check if two given arrays have exactyl same elements
        //arr[] = [12, 3, -5, 14]       brr[] = [14, -5, 12, 3]

        int arr[] = {12, 3, -5, 14};
        int brr[] = {14, -5, 12, 3};

        //Note: Arrays class a method to check if 2 given arrys are same(elemetns and the orders) or not
        Arrays.sort(arr);
        Arrays.sort(brr);
        System.out.println("are the arrays same ? " + Arrays.equals(arr, brr));//true

        //type code to check if a specific element axist in an array or not
        String crr[] = {"Java", "Selenium", "Api", "Sql"};
        String expectedelement = "Sql";

        int counter = 0;
        for (String w : crr) {
            if (w.equals(expectedelement)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("the array has the expected element");
        } else {
            System.out.println("the array doesnt have expected element");
        }

        //Type code to check if the number of usage of specific element in an array
        int drr[] = {12, 2, 23, -5, 12, 23, 12};
        int flag=0;
        int expectedElement=12;
        for(int w:drr){
            if( w== expectedElement){
                flag++;
            }
        }
        System.out.println(expectedElement+" was used "+ flag + " time/s");

    }
}

