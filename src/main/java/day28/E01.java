package day28;

public class E01 {

    /*
    1) Exception is un-expected issue
    2)There are two ways to work with exceptions
       i)Throw exception ==> Ask help
       ii)Handle exception ==> Do it by yourself without asking help
    3) Mainly there are two types of exceptions
        i) Runtime Exception ==> You will see them after clicking run
        ii)Compile time Exception ==> You will see them while typing your code
     */

    public static void main(String[] args) {
        divide(12,3); //4
        divide(0,3); //0
        divide(12,0); //ArithmeticException
    }

    public static void divide(int a , int b) {
       try {
           System.out.println(a / b);
       }catch (ArithmeticException e){
           System.out.println("A math rule was broken");
           System.err.println(e.getMessage()); //===> / by zero

       }finally {
           System.out.println("break the connection");
       }
    }
}
