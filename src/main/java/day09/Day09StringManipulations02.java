package day09;

import java.util.Scanner;

public class Day09StringManipulations02 {
    public static void main(String[] args) {
        /*
            Check if a password has the following conditions
         i)it should not be empty
         ii)it should not be just a single space
         iii)it should not have space at the begining and at the and
         iv)'i' should be acharcater in the password and first occurence of i should be at index 4
         v)'K' should be character in the password and last occurance of 'K' should be at index 5
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a password");
        String pwd = input.nextLine();
        if(!pwd.isEmpty()){
            System.out.println("password is not empty");
        }else{
            System.out.println("password is empty");
        }
        if(!pwd.isBlank()){
            System.out.println("password is not space");
        }else{
            System.out.println("password can not be only space");
        }
        if(pwd.length()>0 && pwd.trim().length()==pwd.length()){
            System.out.println("it does not have space at the begining or at the and");
        }else{
            System.out.println("password can not contain space at the begining and at the end");
        }
        if(pwd.indexOf("i")==4){
            System.out.println("condition 4 is done");
        }else{
            System.out.println("Condition 4 is not done");
        }
        if( pwd.lastIndexOf("k")==5){
            System.out.println("condition 5 is done");
        }else{
            System.out.println("condition 5 is not done");
        }

    }
}
