package day05;

import java.util.Scanner;

public class Day05if {
    /*
    if your score is then 50 then you will fail
     */
    public static void main(String[] args) {
        int score=0;
        if(score<50){
            System.out.println("you failed");
        }

        //Type code to check if the intgere divided by 3 or not
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n%3==0){
            System.out.println("the number can be divided by 3");
        }else{
            System.out.println("the number can not be divided by 3");
        }
        //Type code to check if the first digit a 3 digits intger is less than 5.
        //if its less then 5 print perfect number if not print good number

        if((n/100)%10 <5 ){
            System.out.println("perfect number");
        }else{
            System.out.println("good number");
        }
        //Ask user to enter the initial of the day
        System.out.println("enter the initial of any day name");
        String s = input.next();
        if (s.equals("s")){
            System.out.println("Saturday or Sunday");
        }
        if(s.equals("t")){
            System.out.println("Tuesday or thursday");
        }
        if(s.equals("w")){
            System.out.println("wednesyday");
        }
        if(s.equals("f")){
            System.out.println("friday");
        }
        if(s.equals("m")){
            System.out.println("monday");
        }else{
            System.out.println("enter a proper initial");
        }

    }
}
