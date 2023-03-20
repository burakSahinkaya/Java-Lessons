package day09;

public class Day09StringManipulations03 {
    public static void main(String[] args) {

        /*
         String shirtPrice = '$12.99';
         String bookprice = '$35.99';
         type code to find the sum of the shirt and book
         */
        String shirtPrice = "$12.99";
        String bookprice = "$35.99";

        String s = shirtPrice.replace("$","");
        String b = bookprice.replace("$","");

        double sd = Double.valueOf(s);
        double bd = Double.valueOf(b);

        System.out.println(sd+bd);

    }
}
