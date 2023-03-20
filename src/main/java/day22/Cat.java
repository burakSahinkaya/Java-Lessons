package day22;

public class Cat extends Mamal{
    @Override
    public void eat() {
        System.out.println("Cats eat..");
    }

    @Override
    public Cat createAnimal() {
        return new Cat();
    }
}
