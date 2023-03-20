package day07;

import java.util.Scanner;

public class Day07Switch03 {
    public static void main(String[] args) {

        // ask suer to enter a character, if it is vowel letter print vowel if bot print not vowel
        //,f its not letter print enter a letter
        Scanner input = new Scanner(System.in);

        System.out.println("enter a letter to check if its vowel or not");

        char c = input.next().toLowerCase().charAt(0);
        switch (c){
            case 'a':
            case 'u':
            case 'e':
            case 'i':
            case 'o':
                System.out.println("vowel");
                break;
            case'b':
            case'c':
            case'd':
            case'f':
                System.out.println("not vowel");
                break;
            default:
                System.out.println("enter a letter");
        }
    }
}
