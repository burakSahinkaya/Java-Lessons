package day21;

import day21.Bird;
import day21.Cat;
import day21.Dog;

public class Runner {
    public static void main(String[] args) {
        /*
        1) Private class members can not be inherited by child classes from Paretn Class
        2)"Public" class membres can be used alllways can be inherited
        3)"Protected" class member can be inherited always can be inherited
        4) "Default" class members can not be inherited from other packages
        Note: when you call a "variable" parent child relationship, look a the data type of the object
        note1: when you call method in a parent-child relationship , look at the constructor of the object
        note2: There is "IS-A" relationship from "child class" to "parent clas"
        note3: there is " HAS-A" relationship fform "parent class" to child class

         */

        Cat cat1 = new Cat();
        cat1.meow();
        cat1.drink();
        cat1.eat();
        cat1.weight();

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.drink();
        dog1.eat();

        Bird bird1 = new Bird();
        bird1.tweet();
        bird1.drink();
        bird1.eat();

    }
}
