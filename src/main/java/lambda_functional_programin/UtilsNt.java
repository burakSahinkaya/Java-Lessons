package lambda_functional_programin;

public class UtilsNt {

    public static void printTheSameLineWithSpace(Object str){

        System.out.print(str+" ");

    }
    public static boolean checkToBeEven(int x){
       return x%2==0;

       }
       public static boolean checkToBeOdd(int x){
        return x%2!=0;
       }
       public static int square(int x){
        return x*x;
       }
       public static int cube(int x){
        return x*x*x;
       }
       public static double half(double x){
        return x/2;
       }
       public static char getLastChar(String str){
        return str.charAt(str.length()-1);
       }
    public static char getFirstChar(String str) {
        return str.charAt(0);
    }




}
