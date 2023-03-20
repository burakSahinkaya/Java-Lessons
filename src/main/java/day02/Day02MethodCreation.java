package day02;

public class Day02MethodCreation{
    public static void main(String[] args) {

        System.out.println(addIntegers(5,4));
        System.out.println(multIntegers(4,8));
        System.out.println(subInteger(7,5));
        System.out.println(divdeIntegers(8,5));

    }

    public static int addIntegers(int a, int b){
        return a+b;
    }
    public static int multIntegers(int a, int b){
        return a*b;
    }
    public static int subInteger(int a, int b){
        return a-b;
    }
    public static double divdeIntegers(double a, double b){
        return a/b;
    }

}

