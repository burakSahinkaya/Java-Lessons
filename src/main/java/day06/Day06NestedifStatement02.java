package day06;

import java.util.Scanner;

public class Day06NestedifStatement02 {
    public static void main(String[] args) {


        /*
        Type code by using nested if() statement
        write a program to check if a year is leap year
        if the year is divisible by 100 then it must be divisible by 400
        if a year is not divisible by 100 it must be divisible by 4
         */

        Scanner input = new Scanner(System.in);
        System.out.println("enter a year to check if it is leap year or not");
        int year = input.nextInt();

        //1.way
        if (year%100==0) {
            if(year%400==0){
                System.out.println("this year is leap year");
            }else{
                System.out.println("this not a leap year");
            }
        }else{
            if(year%4==0){
                System.out.println("this year is leap year");
            }else{
                System.out.println("this is not a leap year");
            }
        }

        //2.way
        if(year%100==0 && year%400==0 || year%100!=0 && year%4==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
