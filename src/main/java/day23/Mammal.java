package day23;

public class Mammal extends Animal{
    public Mammal(){
        super("waow");
        System.out.println("Mammal constructor work");
    }
    public Mammal(int num){
        super("adas");
        System.out.println("mammal constructor with int parameter workes ");
    }
    public Mammal(String s){
        this();
        System.out.println("Mammal construoctor with String worked");
    }
}
