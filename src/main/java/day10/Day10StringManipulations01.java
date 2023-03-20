package day10;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Day10StringManipulations01 {
    public static void main(String[] args) {

        //Ask user to enter his full name, then create aunique id for the user
        //id should contain first 2 characters of the first name and lsat 2 chracters
        //Use the current date time at the end of id
        //Example : Tom Hanks ==> Toks20220228110434

        Scanner input = new Scanner(System.in);
        System.out.println("enter your full name");
        String name = input.nextLine();

        String first= name.substring(0,2);
        String last= name.substring(name.length()-2);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        String currentDateTimeWithoutPunct = currentDateTime.toString().substring(0,19).replaceAll("[^0-9]","");

        System.out.println(first+last+currentDateTimeWithoutPunct);
    }
}
