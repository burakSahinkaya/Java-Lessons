package day29;

public class E01 {
    /*
      1)When you use throw keyword?
         when we want to throw any exception in a method body, we use "throw" keyword
         You can use "throw" keyword many times in a method body
         After using  "throw" keyword you have to exception object("new" + "constructor"
     */

    public static void main(String[] args) {
        try {
            setAge(-12);
        }catch (IllegalArgumentException e){
            System.out.println("age can not be negative");
        }

    }
    public static void setAge(int age){
        if(age<0){
            throw new IllegalArgumentException();
        }else{
            System.out.println("The age is "+age);
        }
    }

}
