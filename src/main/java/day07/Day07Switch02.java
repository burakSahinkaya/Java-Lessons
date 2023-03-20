package day07;

import java.util.Scanner;

public class Day07Switch02 {
    public static void main(String[] args) {

        //Ask user to enter day number then print all day numbes starting with given day number
        //user ==> 5 outpur ==> Thursday - Friday - Saturday

        Scanner input = new Scanner(System.in);
        System.out.println("enter day number");
        int dayNum = input.nextInt();

        switch(dayNum){

            case 1:
                System.out.println("Sudnay ");

            case 2:
                System.out.println("Monday ");

            case 3:
                System.out.println("Tuesday ");

            case 4:
                System.out.println("Wednesday ");

            case 5:
                System.out.println("Thursday ");

            case 6:
                System.out.println("Friday ");

            case 7:
                System.out.println("Saturday ");
                break;
            default:
                System.out.println("enter valid day number");

        }
    }
}
