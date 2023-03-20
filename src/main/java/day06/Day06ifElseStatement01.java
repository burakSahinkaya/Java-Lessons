package day06;

import java.util.Scanner;

public class Day06ifElseStatement01 {
    /*
    if the score is less than 50 then you will fail
    if the score is greater than or equal 50 you will fail

    if the score is less than 50 you will fail otherwise you will pass
     */
    public static void main(String[] args) {
        //Ask user to enter the score, if the scoere is less than 50
        //print "fail" on the concole otherwise print "pass"
        Scanner input = new Scanner(System.in);
        System.out.println("enter your score please");
        int score = input.nextInt();
        if(score<50){
            System.out.println("fail");
        }else{
            System.out.println("pass");
        }
        //Ask user to enter the number of the day than print the name of the day
        System.out.println("enter day umber");
        int day = input.nextInt();
        if(day==1){
            System.out.println("Sunday");
        } else if (day==2) {
            System.out.println("monday");
        } else if (day==3) {
            System.out.println("tuesday");
        } else if (day==4) {
            System.out.println("wednesday");
        } else if (day==5) {
            System.out.println("thursday");
        }else if (day==6) {
            System.out.println("friday");
        } else if (day==7) {
            System.out.println("saturday");
        }else{
            System.out.println("enter a proper day number");
        }

    }
}
