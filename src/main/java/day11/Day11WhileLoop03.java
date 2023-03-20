package day11;

public class Day11WhileLoop03 {
    public static void main(String[] args) {

        //Type code to print the sum of the digits of an integer

        int sum =0;
        int i= 2379;
        while(i>0){
            sum = sum + i%10;
            i=i/10;
        }
        System.out.println(sum);

        //Type code to create a multiplication table for any given number

        int j = 5;
        int k =1;
        while(k<11){
            System.out.print(j+"x"+k+"="+j*k+" ");
            k++;
        }


    }
}
