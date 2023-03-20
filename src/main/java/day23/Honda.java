package day23;

/*
   1) If you do not put body for a method it will be abstract method
   2) To make a method abstract you have to use absract keyword before the return typpe
   3) Abstract method can not be put into a regular class, when you create an abstract
      method you have to make the class abstract
   4) To make class abstract use "abstract" keyword before the class keyword
   5) The method without body called abstract method, the body with body called concrete method
   6) "Concrete child classes" must override(implement) abstract methods from all parents,
       otherwise Java gives CTE. It ıs not mendatory for abstract child clsses
   7) "Abstract classes" may have both "abstract methods" and "concrete methods"
   8) If you want to make a functionality mandotary for all "concrete child classes
      make the method abstract
   9) Can we make an abstract class final class?
      "Final classes" can not have child classes, we create abstract classes to do sth
      mandotary for child classes. This is contradiction because of that Java does not
      allow to make an abstract class "final"
   10) Abstract methods were created to override if you make an abstract method private
       it can not be overriden, therefore java doesnt allow to amke an abstract method private
   11) we can not create object from Abstract classes because abstract classes have sth
       un-complete like abstract methods
     Note : abstract classes are classes , therefore they have constructors, but the
            constructors can not create objects
   12) If any abstract method was overriden by any concrete class it is not mendotary
       to override the abstract method for the concrete child classes of the concrete classes

 */

public abstract class Honda {

    public abstract void engine();
    public void musicSystem(){
        System.out.println("The most update music system...");
    }
}
