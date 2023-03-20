package day10;

public class Day10ForLoop01 {
    public static void main(String[] args) {

        //There are 4 loops; 1)for-loop 2)while-loop 3)do-while-loop 4)for-each-loop

        //Type "Hi!" on the console 5 time
        //1)for-loop
        for(int i = 1;i<6;i++){
            System.out.println("Hi!");
        }

        //Example 1: Type integers from 10 to 3 o the console using for-loop
        for(int i=10;i>2 ;i--){
            System.out.print(i+" ");
        }
        System.out.println("");
        //Example 2: Type even integers from 4 to 15 on the console
        //1. wa
        for(int i = 4; i<16 ;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        //2.way
        for(int i =4;i<16;i=i+2){
            System.out.print(i+" ");
        }
        System.out.println("");

        //Example 3 : Type odd integers from 4 to 15 byusing for loop
        for(int i = 4; i<16;i++){
            if(i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        //Exqmple 4 print all integers from 10 to except 17 on the console

        //1.way
        for(int i = 10; i<33;i++){
            if(i!=17){
                System.out.print(i+" ");
            }
        }
        System.out.println("");

        //2.way
        for(int i = 10; i<33;i++){
            if(i==17){
                continue;
            }
        System.out.print(i+" ");
        }

        System.out.println("");

        //Example 4 : Print all integers from 10 to 32 except if the integr is less than 21 greater 18

        for(int i =10;i<32;i++){
            if(i<21 && i>18){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("");

        //Example 5: Type String characters one by one on the console if you see x stop printing
        // Publix is the best ==> Publi
        String str ="Publix is the best";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='x'){
                break;
            }
            System.out.print(str.charAt(i));
        }

    }
}
