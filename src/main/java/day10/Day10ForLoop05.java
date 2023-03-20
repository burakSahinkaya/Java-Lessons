package day10;

import java.util.Scanner;

public class Day10ForLoop05 {
    public static void main(String[] args) {

        /*
        Ask the user how many fibonacci numbers he wants to see
        Then write the code that prints these fibonacci numbers
        example: if user typed 6 print 1 1 2 3 5 8
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of fibonacci that you want to see");
        int a = input.nextInt();

        int fibo1 = 1;
        int fibo2= 1;
        int fibonacci = 0;
        System.out.print(fibo1+" ");
        System.out.print(fibo2+" ");
        for(int i=1;i<a-1;i++){
            fibonacci = fibo1+fibo2;
            fibo1=fibo2;
            fibo2=fibonacci;
            System.out.println(fibonacci+" ");
        }
    }
}
