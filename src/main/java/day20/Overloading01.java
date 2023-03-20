package day20;

/*
   Polymorphism = Overloading + Overriding

   1)we need methods with same name and different parameters to make our code more readable
   This is method overloading
   2) how can you make parameters different
      i) by changing number of parameters
      ii)By changing data types of the parameters
      iii) By changing teh orders if the data types are different
   3) Can you overload private methods
      Method overloading is done in a single class, private access modifier creates issues if you are
      outsideof the class.Therefore doing methdod overloading will not be problem for privet methods
   4) Can you overload "Static" methods
     "Static " methods can be overloaded
   5) Method overloading is a part of polymorphism because we create a method in multiple forms.
 */

public class Overloading01 {

    public static void main(String[] args) {

        add(3,4);
        add(3,"Java");

    }

    public static  int add(int a, int b){
        return a+b;
    }
    public static double add(double a , double b){
        return a+b;
    }
    public static String add(String a, String b){
        return a+b;
    }
    public static String add(String a, int b){
        return a+b;
    }
    public static String add(int a, String b){
        return a+b;
    }
}
