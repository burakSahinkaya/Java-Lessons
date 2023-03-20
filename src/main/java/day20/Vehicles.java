package day20;
/*
    1)Constructors are used to create an object from a class
      if there is no construtor, it is impossible to create an object from class
    2) Java knows classes are for object creations, because of that java puts contrrcter inevery class
       Constructor coming fromn Java will be invisible, it is called "Default constructor"
       default constructors ==> public Vehicles() {} c
    3) Java is jelaous, when you create your own constructor java deletes the default one
    4)What are the differences between constructors and methods?
       i) Constructors are for object creation but methods are for action
       ii)Constructors dont have retunr type but methods must have (int,Stribger,...)
       iii) the name of Constructors must match with the name of the class name, methods can use any name
     */
public class Vehicles {

    String make;
    String model;
    int year;
    double price;

    public Vehicles() {

    }

    public Vehicles(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Vehicles(String make, String model, double price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public Vehicles(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }

}
