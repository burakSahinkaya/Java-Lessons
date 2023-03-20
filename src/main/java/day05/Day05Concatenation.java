package day05;

public class Day05Concatenation {
    /*
    Concatinations : Joining strings with each other or with other data types
                     to do concatinations we have 2 options
                     1) use '+' sign
                     2)use 'concat()' method
     */
    public static void main(String[] args) {
        String s= "Tom";
        String t = "Hanks";
        int i = 12;
        int k = 5;
        char c = 'A';

        System.out.println(s+" "+t);
        System.out.println(s.concat(" ").concat(t));//same shit

        System.out.println(s+i+k);//Tom125

        System.out.println(s+(i+k));//Tom17

        System.out.println(i+k+s);//17Tom

        System.out.println(i+s+k);//12Tom5

        System.out.println(s+k*i);//Tom60

        System.out.println(i+c+s);//77Tom

        System.out.println(c+s+k);//ATom5



    }
}
