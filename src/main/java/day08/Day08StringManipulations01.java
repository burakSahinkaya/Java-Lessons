package day08;

public class Day08StringManipulations01 {
    public static void main(String[] args) {

        //Example 1 :Count the alphabetic character in a given Strings
        //Tom12 Hanks!... ==> 8
        String name = "  Tom12 Hanks!...   ";
        int numOfletters = name.replaceAll("[^A-Za-z]","").length();
        System.out.println(numOfletters);

        //Example 2 :Get the initials from full name.
        //Tom Hanks ==> TH
        String fullName = "   tOM Hanks   ";
        String initialOfFirstName = fullName.trim().substring(0,1).toUpperCase();
        String initialOfLastName = fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(initialOfFirstName+initialOfLastName);

        //Example 3: Fix the day names like "Sunday"
        //"sunday" ==> "Sunday"
        String dayName ="    sUNDAY  ";
        String initialDayName = dayName.trim().substring(0,1).toUpperCase();
        String otherCharsOfDayName = dayName.trim().substring(1).toLowerCase();
        System.out.println(initialDayName + otherCharsOfDayName);

        //Example 4: Make all digits except last 4digits of a credit card invisible by using '*'
        //1234 1234 1234 1234 1234
        String creditCardNumber = "1234 1234 1234 1234";
        String firstPart = creditCardNumber.substring(0,15).replaceAll("[0-9]","*");
        String lastPart = creditCardNumber.substring(15);
        System.out.println(firstPart+lastPart);

        //Example 5 : count how many characters differnt from space used in a String
        //"Tom Hanks was born in 1975."
        //1.way
        String differChar = "Tom Hanks was born in 1975.";
        int result = differChar.replaceAll(" ","").length();
        System.out.println(result);

        //2.way:
        int numOfCharacters= differChar.replace(" ","").split("").length;
        System.out.println(numOfCharacters);

    }
}
