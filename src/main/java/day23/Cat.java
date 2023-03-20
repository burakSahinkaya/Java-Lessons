package day23;

public class Cat extends Mammal {
    public Cat(){
        super(12);//Super with pharanthesis must be in the first lin eof the constructor
                       //In a constructor body you can do just a single constructor call
        System.out.println("Cat constructor worked");
    }
    public Cat(boolean b){
        super();//Typing super is optional if you type your code will be more readable
        System.out.println("Cat constructor with boolean parameter worked");
    }
}
