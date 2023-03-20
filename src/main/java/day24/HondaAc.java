package day24;

public interface HondaAc {

    /*
       You can not create object from interfaces.
       Interfaces do not have constructors but remember abstract classes have
     */

    /*
              VARİABLES
    1) Every variable is public static final in the interface
    2) If you want you can type public static final to make your code more readable
    3) "final variable must be initialized because of that every variable in an interface must initialized
    4) If you have some variables whose signature are same in parent Interfaces, when you call them
       you have to declare the name of the interface otherwise it will give CTE


    */
    String make = "Samsung";
    double price = 890.00;


    /*
               METHODS
    1) All methods in an interface must be abstract
    2) Using abstract keyword for methods is optional
    3) All methods in an interface must be public
    4) Normaly we can not put methods with body in an interface but java created default method
       you can use them in an interface they will have body
     */
    void cool();
    void run ();

    //"default" over here is not access modifier it işs for creating method with body in an interface
    public default void bacteriaKiller(){
        System.out.println("This AC kills %99,9 bacteria");
    }
    //By using Static keyword you can create method body in an interface
    static void climateCool(){
        System.out.println("This ac cools according to climate");
    }

}
