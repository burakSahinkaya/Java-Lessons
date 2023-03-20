package day22;

public class Runner {

    /*
    4) inheritance  is perequisie for method  overrideng if there is no parent child relationship
       there will be no method overriding
    5) the method in child class is called "Overriding method"
    6)Access modifier of "Overriding Method " can not be narrower than access modifier of overriding data
    7) Return type can not be narrow than the data returned
    8) Return type of "Over Riding method " can not be wider than "over ridden method"
    note: normally return type can be object everytime but in "Method overriding" it can be
          the return type of the overrridden method
     Example: The return type of the overriden method is Mamamal
              What canbe the return method prooduces a Dog Object ==> Dog and Mammal
     */

    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.createAnimal();

        Dog d = new Dog();
        d.eat();

    }


}
