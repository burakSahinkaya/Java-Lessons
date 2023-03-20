package day09;

public class Day09StringManipulations04 {
    public static void main(String[] args) {

        //Type a code to find the number of punctutation marks used in a String.
        String str = "Wow!... Ali is 13 years old, and he is a university student.";
        int totalNumOfChars = str.length();
        String strWithoutPunctuationMarks = str.replaceAll("[^A-Za-z0-9 ]" ,"");
        System.out.println(strWithoutPunctuationMarks);

        int totalNumOfCharsWithoutPunctuation = strWithoutPunctuationMarks.length();
        System.out.println(totalNumOfCharsWithoutPunctuation);

        //Create a method prints greetings by using the given name
        //Ali => Hi Ali     Tom => Hi Tom
        System.out.println(greetUser("Ali"));

        //Create a method makes the decimal part has 5 digits
        System.out.println(limitDecimalPart(12.21f));


    }
    public static String greetUser(String name){

       return String.format("Hi %s welcome",name);
    }
    public static String limitDecimalPart(float number){
        return String.format("The price is %.5f",number);
    }
}
