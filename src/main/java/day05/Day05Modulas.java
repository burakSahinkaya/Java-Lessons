package day05;

import java.util.Scanner;

public class Day05Modulas {

    /*
       Modulus operator : % is called modlus operator in java
                          13%5 ==> 3
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an intege....");
        int n = input.nextInt();
        int absoluteN = Math.abs(n);
        //Ask user to enter an integer the print the last digit of the integer
        int lastDigit = absoluteN%10;
        System.out.println(lastDigit);

        //ASk user to enter his birth year, then print just lsat 2 digits of the console

        System.out.println("enter your birth year...");
        int year = input.nextInt();
        int last2digit = year%100;
        System.out.println(last2digit);

        //ask user to enter an integer then check if the number is even
        System.out.println("even or not");
        int evenornot = input.nextInt();
        System.out.println("is the number even "+ (evenornot % 2 == 0));

        //ask user to enter an integer and check if the numbe is odd
         int oddornot = input.nextInt();
        System.out.println("is the number odd"+(oddornot%2 != 0));

        //ASk user to enter3 digits integer find the sum of the digits
        int digits3 = input.nextInt();
        int abs3 =  Math.abs(digits3);
        int firstdgt = abs3%10;
        int seconddgt = (abs3/10)%10;
        int thirddgr = (abs3/100)%10;

        System.out.println(firstdgt+seconddgt+thirddgr);
    }


}
