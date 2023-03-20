package day17;

import java.util.Scanner;

import static day17.StaticKeyword03.setStdId;

public class runner {
    public static void main(String[] args) {
        /*
        Create unique student ids for evrey regisered stuents
        Tom Hanks registered to math course ==> TH2022901001
         */

        Scanner input  =new Scanner(System.in);
        System.out.println("enter your name and surname");
        String stdName = input.nextLine();
        System.out.println("enter your class name");
        String cName = input.next();

        StaticKeyword03 std1 = new StaticKeyword03();


        System.out.println(setStdId(stdName,cName));


    }
}
