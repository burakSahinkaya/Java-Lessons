package day18;

public class Varargs01 {

    /*
    1) varargs are used to handle multiple parameters in a single method
    2) any prameter can not be used after varargs
    3)Before varargs we can use parameters different from varargs
    4)in a method we can use just a single varags and it must be the last parameter everytime
     */

    public static void main(String[] args) {

        System.out.println(add(3,5,6,4));


    }
    public static int add(int... a){
        int sum = 0;
        for(int w: a){
            sum = sum + w;
        }
        return sum;
    }
    public static int sub(int a, int b){
        if(a>b){
            return  a-b;
        }else {
            return  b-a;
        }

    }
}
