package day12;

import java.util.Scanner;

public class Day12DoWhileloop01 {
    public static void main(String[] args) {

        /*
        ASk user an integer
        if the integer is less than 100, tell user "won"
        otherwise,tell user "Lost"
         */
        Scanner input = new Scanner(System.in);
       //1. way
        int i =0;
            do {

                System.out.println("enter an integer");
                i = input.nextInt();
                if (i < 100) {
                    System.out.println("Won!");
                }
            } while (i < 100);
            System.out.println("Lost!");

            //2.way
        int k = 0;
        do{
            System.out.println("enter an integer");
            k = input.nextInt();
            if(k>=100){
                System.out.println("lost");
                break;
            }
            System.out.println("won");
        }while (true);
    }
}
