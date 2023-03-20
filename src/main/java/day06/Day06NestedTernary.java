package day06;

public class Day06NestedTernary {
    public static void main(String[] args) {

        /*
        Type java code by using nested ternary
        Write a program to check if a year is leap year or not
        if the year is divisible by 100 then it must be divisible by 400
        if a year is not divisible by 100 then it must be divisible by 4
         */
        int year = 1264;
       String result= year%100==0?(year%400==0?"leap year":"not"):(year%4==0?"leap year":"not");
        System.out.println(result);

        //What if ternary returns different data types?
        String s = "Tom Hanks";
        System.out.println( s.startsWith("K")?s.length():String.valueOf(s.charAt(0)));

        //if its mandatory to create a coontainer for the result of the ternary, convert data types to the same data type
        String result2= s.startsWith("T")?String.valueOf(s.length()):String.valueOf(s.charAt(0));
        System.out.println(result2);

    }
}
