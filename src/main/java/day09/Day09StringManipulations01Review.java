package day09;

public class Day09StringManipulations01Review {
    public static void main(String[] args) {
        //Example 1 :Count the alphabetic character in a given Strings
        //Tom12 Hanks!... ==> 8
        String s = "Tom12 Hanks!... ";
        String sc = s.replaceAll("[^A-Za-z]","");
        System.out.println(sc.length());

        //Example 2 :Get the initials from full name.
        //Tom Hanks ==> TH
        String name = "Tom Hanks";
        String firstinitial = name.trim().toUpperCase().substring(0,1);
        String secondinitial = name.trim().toUpperCase().split(" ")[1].substring(0,1);
        System.out.println(firstinitial+secondinitial);

        //Example 3: Fix the day names like "Sunday"
        //"sunday" ==> "Sunday"
        String dayName = "sUNDAy";
        String initialOfDayName = dayName.trim().toUpperCase().substring(0,1);
        String lastPartOfDayName = dayName.trim().toLowerCase().substring(1);
        System.out.println(initialOfDayName+lastPartOfDayName);

        //Example 4: Make all digits except last 4digits of a credit card invisible by using '*'
        //1234 1234 1234 1234 1234
        String cardNumber = "1234 1234 1234 1234";
        String invisiblePart = cardNumber.substring(0,15).replaceAll("[0-9]","*");
        String visiblePart = cardNumber.substring(15);
        System.out.println(invisiblePart+visiblePart);

        //Example 5 : count how many characters differnt from space used in a String
        //"Tom Hanks was born in 1975."
    }
}
