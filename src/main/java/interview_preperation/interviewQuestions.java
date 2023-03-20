package interview_preperation;

import java.util.Scanner;

public class interviewQuestions {
    public static void main(String[] args) {
        //ask user to enter 2 numbers then swap them
        //a =12 and b = 13 ==> a=13 and b=12

        Scanner input = new Scanner(System.in);
        System.out.println("enter first numbe");
        double a = input.nextDouble();

        System.out.println("enter second number");
        double b = input.nextDouble();

        //1.way
        double c;
        c=a;
        a=b;
        b=c;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
/*
       Interview Questions
    1) What is the difference between overriding and overloading
     i)Overriding needs inheritance bu for overloading there is no need
     ii)for overloading method signatures must be different but for overriding method signature must be same
     iii)static, private, and final methods can not be overriden but they can be overloaded
 */


        /*
        2) What is the difference between "this" and "this()"
            "this" is used to call variable or methods.
            "this() is used to call constructors from class itself
         */

        /*
        3) What is the difference between HashSet and HashTable
           HashMap is not thread safe HashTable is
           HashMap is not syncronized hashTable is

         */

    }
}
