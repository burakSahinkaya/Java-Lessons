package day12;

import java.util.Arrays;

public class Day12Arrays01 {
    public static void main(String[] args) {

        /*
        1) Arrays are for storing multiple data
        2) An array can have just single data type
        3)Arrays can store just primitive data types or references of non-primitives
          An array can not hve non-prmitive data types
        4)When you create an array you have to declare its lenght(number of elements)
         */

        //How to create an array
        int ages[] = new int[4];

        //how to print an array on the console
        System.out.println(Arrays.toString(ages));

        //How to assign values to array elements
        ages[0] = 12;
        ages[3] = 9;
        ages[1] = 20;
        ages[2] = 11;
        System.out.println(Arrays.toString(ages));

        //How to print array elements  one by one
        System.out.println(ages[2]);//11

        //Print the sum of the ages array elements on the console

        //1.way
        System.out.println(ages[0]+ages[1]+ages[2]+ages[3]);

        //2.way
        int sum = 0;
        for(int i = 0;i<ages.length;i++){
            sum=sum+ages[i];
        }
        System.out.println(sum);

        //How to create an array and asign values in short way
        String names[]= {"Tom","jim","alex","karl"};
        System.out.println(Arrays.toString(names));//[Tom, jim, alex, karl]

        //Find the total number of characters in array elements
        int total=0;
        for(int i = 0;i<names.length;i++){
            total = total +names[i].length();
        }
        System.out.println(total);


    }
}
