package day07;

import java.util.Scanner;

public class Day07Switch04 {
    public static void main(String[] args) {
        //Ask user to enter one of the +,-,*,/,% operations
        //Ask user to enter two values then return result of the operations

        Scanner input = new Scanner(System.in);
        System.out.println("enter firs number");
        double n1 = input.nextDouble();
        System.out.println("enter second number");
        double  n2 = input.nextDouble();
        System.out.println("enter one of the +,-,*,/,% operations");
        char opr = input.next().charAt(0);

        switch (opr){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n1);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case'/':
                System.out.println(n1/n2);
                break;
            case '%':
                System.out.println(n1*n2/100);
                break;
            default:
                System.out.println("enter valid operation");
        }
        /*
        note 1: String, int, char can be used in switch statement
        note 2: boolean, long, float, double can not be used in switch
         */
    }
}
