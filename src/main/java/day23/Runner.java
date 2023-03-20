package day23;

public class Runner {

    /*
    1)super() is used to call constructors from parent class.
         i) if the parent class has multiple constructors by the help of the parameters
         you can select any constructor
         ii)Typing super() is optional but if you use super() with parameters you have to type iy
         iii) super() must be in the first line of the constructor body

    2)this() is used to call constructors from class itself.
         i) if the class has multiple constructors by the help of the parameters
         you can select any constructor
         ii)Typing this() is not optional but if you have to have a parameter
         iii) this() must be in the first line of the constructor body

    3) "super" keyword is used to select any variable or any method from parent class
       "this" keyword is used to sellect an variable or any method from tha class itself

       note :  What is the difference between "this" and "this()"
            "this" is used to call variable or methods.
            "this() is used to call constructors from class itself

       note:  What is the difference between "super" and "super()"
            "super" is used to call variable or methods.
            "super() is used to call constructors from class itself
     */

    public static void main(String[] args) {

        Cat c = new Cat();
        System.out.println();

        Bird b = new Bird();
        System.out.println();

        Cat c2 = new Cat(true);
        System.out.println();

        Dog d = new Dog();
        System.out.println();

        Dog d1 = new Dog(5);


    }
}
