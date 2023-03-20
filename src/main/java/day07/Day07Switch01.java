package day07;

import java.util.Scanner;

public class Day07Switch01 {
    public static void main(String[] args) {

        /*
        ask user to enter the month name and print the month number
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter any month name");
        String month = input.next();
        //1.Way : Else if method
        if(month.equalsIgnoreCase("January")){
            System.out.println("1");
        } else if (month.equalsIgnoreCase("Febuary")) {
            System.out.println("2");
        }else if (month.equalsIgnoreCase("March")) {
            System.out.println("3");
        }else if (month.equalsIgnoreCase("April")) {
            System.out.println("4");
        }else if (month.equalsIgnoreCase("May")) {
            System.out.println("5");
        }else if (month.equalsIgnoreCase("June")) {
            System.out.println("6");
        }else if (month.equalsIgnoreCase("July")) {
            System.out.println("7");
        }else if (month.equalsIgnoreCase("August")) {
            System.out.println("8");
        }else if (month.equalsIgnoreCase("September")) {
            System.out.println("9");
        }else if (month.equalsIgnoreCase("October")) {
            System.out.println("10");
        }else if (month.equalsIgnoreCase("November")) {
            System.out.println("11");
        }else if (month.equalsIgnoreCase("December")) {
            System.out.println("12");
        }else{
            System.out.println("please enter valid mont name");
        }

        //2.way : switch
        switch (month.toLowerCase()){
            case"january":
                System.out.println("1");
                break;
            case"febuary":
                System.out.println("2");
                break;
            case"march":
                System.out.println("3");
                break;
            case"april":
                System.out.println("4");
                break;
            case"may":
                System.out.println("5");
                break;
            case"june":
                System.out.println("6");
                break;
            case"july":
                System.out.println("7");
                break;
            case"august":
                System.out.println("8");
                break;
            case"september":
                System.out.println("9");
                break;
            case"october":
                System.out.println("10");
                break;
            case"november":
                System.out.println("11");
                break;
            case"december":
                System.out.println("12");
                break;
            default:
                System.out.println("please enter a valid month name");

        }
    }
}
