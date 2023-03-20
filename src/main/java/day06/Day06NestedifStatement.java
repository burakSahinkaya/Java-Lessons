package day06;

import java.util.Scanner;

public class Day06NestedifStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your gender");
        String gender = input.next().toLowerCase();


        System.out.println("enter your age");
        int age = input.nextInt();

        /*
        if the gender is male and gender is less than 13 print 'boy' otherwise 'man'
        if the gender is female and gender is less than 13 print 'girl' otherwise 'woman'
        if the gender is differetn from male or female prnt no information
         */

        if(gender.equals("male")) {
            if (age < 13) {
                System.out.println("boy");
            } else {
                System.out.println("man");
            }

        }else if(gender.equals("female")){
            if(age<13){
                System.out.println("girl");
            }else{
                System.out.println("woman");
            }
        }else{
            System.out.println("no information");
        }


    }
}
