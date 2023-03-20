package day22;

public class Dog extends Mamal {
    @Override
    public void eat() {
        super.eat();
        System.out.println("Dogs are annimal so they eat as well");
    }
}
