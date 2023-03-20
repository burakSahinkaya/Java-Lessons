package day17;

public class StaticKeyword02 {
    public static void main(String[] args) {

        //Just class name is eneough to access "static" things
        System.out.println(StaticKeyword01.sCounter);//0

        //To access non-static things you have to create object
        StaticKeyword01 obj4 = new StaticKeyword01();
        System.out.println(obj4.counter);//1    This and

        //To access "static" things using object is allowed
        //but not recommended
        System.out.println(obj4.sCounter);//1    This gives 1 because i constructed the obj4 and it increased their value



    }
}
