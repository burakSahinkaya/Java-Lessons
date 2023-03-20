package day20;

/*
1)Object oriented programming language hs 4 main principals
        i)Encapsulation  ii)Polymorphism iii)Inheritance iv) Abstraction
     2)Encapsulation : Data hiding
         i) Some data needs to be hidden like password, username...
         ii)By hiding some data we make our codes more readable
         iii)Encapsulation gives use felxibility
      3)how to hide data
        By using private access modifier i can hide the data
      4)After hiding data how can you use it ?
        After hiding data by the help of the getters i  can access to encapsulating data
        note: Getter methods i) Should have "public" access modifier
                             ii) its return type must be same with the data type of the variable
                             iii)are named like get+ capitalized variable name
                                 but if the data type is boolean getter method are named like is+capitalized variable name
                             iv)do not use any parameter because they return the value of existing variable
      5)After hiding data haw can you update it
        After hiding data by the help of the setters i can udpate the encapsulated data
      6) to do the encapsulation follow the  iven 5 steps in the calss
         1) we created privae variables
         2) create constructor youu ned
         3) we created getters
         4) we created setters
         5) Create toString()
         Note : In this class, getters and setters are called "Java bean" as well
      7)If you do not create any setter() the class will be "immutable class"
 */

public class Student {
    //1) we created privae variables
    private String name = "Tom Hanks";
    private int age =13;
    private boolean succesfull = true;

    //2) create constructor youu ned
    public Student() {
    }

    public Student(String name, int age, boolean succesfull) {
        this.name = name;
        this.age = age;
        this.succesfull = succesfull;
    }

    //3) we created getters
    public String getName() {

        return name;
    }
    public int getAge() {
        return age;
    }

    public boolean isSuccesfull() {
        return succesfull;
    }

    //4) we created setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSuccesfull(boolean succesfull) {
        this.succesfull = succesfull;
    }

    //5) Create toString()
    @Override // İf you want to see object details on the console create toString() method
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", succesfull=" + succesfull +
                '}';
    }
}
