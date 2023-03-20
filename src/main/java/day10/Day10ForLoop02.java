package day10;

import java.util.Scanner;

public class Day10ForLoop02 {
    public static void main(String[] args) {

        //Type code to reverse a String
        String str = "Tom Hanks";
        String reversed = "";
        for(int i =str.length()-1;i>=0;i--){
            reversed= reversed+str.charAt(i);
        }
        System.out.println(reversed);

        System.out.println("");

        //Type code to find the sum of the digits pf an integer
        //2543 ==>14
        Scanner input = new Scanner(System.in);
        System.out.println("enter a integer to find the sum of digits");
        int num = input.nextInt();
        int absNum = Math.abs(num);

        int sum = 0;
        for(int i=absNum;i>0;i=i/10){
            sum = sum + i%10;
        }
        System.out.println(sum);



    }
}
