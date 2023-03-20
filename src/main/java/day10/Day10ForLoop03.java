package day10;

import java.util.Scanner;

public class Day10ForLoop03 {
    public static void main(String[] args) {
        //Type code to print unique charcater in a string
        //Alabama ==> Alm

        Scanner input = new Scanner(System.in);
        System.out.println("enter a String to see uniuqe characters");
        String uniques = input.nextLine();

        for(int i=0;i<uniques.length();i++){
            char c = uniques.charAt(i);
            if(uniques.indexOf(c)==uniques.lastIndexOf(c)){
                System.out.print(c);
            }
        }

        System.out.println("");
        //Type code to print following image on the console
        /*
                   X X X X X
                   X X X X X
                   X X X X X
        */
        System.out.println("enter the number of columns and rows");
        int col = input.nextInt();
        int row = input.nextInt();
        for(int i =1;i<=row;i++){
            for(int j =1;j<=col;j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
