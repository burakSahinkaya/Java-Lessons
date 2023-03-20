package day13;

import java.util.Arrays;
import java.util.Scanner;

public class Day13Arrays02 {
    public static void main(String[] args) {


        //Create a String array by gettting element from user
        //type code to put element in alphabetical order
        //Type code to prnt the total number of characters

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element you want to in the elements");
        int length = input.nextInt();

        String arr[] = new String[length];

        for(int i = 0;i<length;i++){
            System.out.println("enter the "+(i+1)+ " element");
            arr[i]=input.next().toLowerCase();

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int total = 0;
        for(int i=0;i<length;i++){
            total = total + arr[i].length();
        }
        System.out.println("total number of the element is "+total);
    }
}
