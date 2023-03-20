package day11;

public class Day11WhileLoop02 {
    public static void main(String[] args) {

        //Type code to check if Da given nteger is polindrome or not
        //Palindrome : 121<==>121

        int i =121;
        String iS = String.valueOf(i);
        String reversed="";

        int k = iS.length()-1;
        while(k>=0){
            reversed=reversed+iS.charAt(k);
            k--;
        }
        if(iS.equals(reversed)){
            System.out.println("this is palindrome");
        }else{
            System.out.println("this is not palindrome");
        }


    }
}
