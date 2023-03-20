package day06;

import java.util.Scanner;

public class Day06ifElseStatement02 {
    public static void main(String[] args) {

        //Ask user enter the password ad check if the password is valid
        /*
        rules 1) at least 8 charcater
              2)contains at least 1 uppercase
              3)contains at least 1 lowercase
              4)contqains at least 1 symbol
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your pasword");
        String pwd = input.next();

        //1.way
        if(pwd.length()<8){
            System.out.println("password is inavalid you need at least 8 charcaters");
        } else if(pwd.replaceAll("[^A-Z]","").length()==0) {
            System.out.println("password is invalid you need at least 1 uppercase");
        } else if (pwd.replaceAll("[^a-z]","").length()==0) {
            System.out.println("password is invalid you need at least 1 lowercase");
        }else if(pwd.replaceAll("[A-Za-z0-9]", "").length()==0){
            System.out.println("password is invalid you need at least 1 symbol");
        }else{
            System.out.println("your password is valid");
        }
        System.out.println("===========================================");

        //2.way
        if(pwd.length()<8){
            System.out.println("password is inavalid you need at least 8 charcaters");
        }
        if(pwd.replaceAll("[^A-Z]","").length()==0) {
            System.out.println("password is invalid you need at least 1 uppercase");
        }
        if (pwd.replaceAll("[^a-z]","").length()==0) {
            System.out.println("password is invalid you need at least 1 lowercase");
        }
        if(pwd.replaceAll("[A-Za-z0-9]", "").length()==0){
            System.out.println("password is invalid you need at least 1 symbol");
        }

    }
}
