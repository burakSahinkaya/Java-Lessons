package day17;

import java.time.LocalDate;

import java.util.Scanner;

public class StaticKeyword03 {

    public static int counter =1000;

    public StaticKeyword03(){
        counter++;
    }


    public static String setStdId(String name,String courseName){

        String firstInInial = name.trim().split(" ")[0].substring(0,1).toUpperCase();
        String lastInInitial = name.trim().split(" ")[1].substring(0,1).toUpperCase();

        LocalDate date = LocalDate.now();
        int year = date.getYear();

        int courscode = 0;
        switch (courseName.toLowerCase()){
            case "math":
                courscode = 901;
                break;
            case "science":
                courscode = 902;
                break;
            case "art":
                courscode = 903;
                break;
            case "computer":
                courscode = 904;
                break;
            default:
                System.out.println("that course doesnt exist");
        }

        return firstInInial+lastInInitial+year + courscode +counter;
    }
}
