package day19;

public class StringBuilder01 {

    /*
       1) String class is "immutable" but sometime s we need mutable String, because of that
       Java created "StringBuilder" and StringBuffer classes

       2) when you use "String str1 = "Java"; " to create aString java create String pool in heap
       memory and puts the str1 object inside the string pool

       3)when you create a new String bu using String u = new String("Jdbc"); java will check the
       String poool if htere is an object whose value is same tehn java does not create a new container
       just points the existing one. Java does that to save memory

      4) whhen multiple pointers point the same object, any  updates on the object will effect all Strings but
      we dont want it. To prevent all Strings to be updated java created immutability
      in immutabilaty, exsiting object will not be updated java will creat a new object

      5)if you want to create differetn objects with the same value you have to use String u = new String("Jdbc");

      6) if any object daoesnot have any pointer garbage collecter will ddelete it automaticaly to make the memory celan

      7) String class , all wrapper classes are immutable
       not: if you use == to compare Strings, it will check  i)Value ii) adress.
       note : equals() method checks justhe values not the adresses. İf values are same
     */

    public static void main(String[] args) {

        String str1 = "Java";

        String str2 = "Java";

        str1 = "Apex";
        System.out.println(str1==str2);

        String accountHolder1 = "Jack";
        String accountHolder2 = "Jack";
        String accountHolder3 = "Jack";

        String s = "Sql";
        s = "MySql";

        String t = "Jdbc";
        String u = new String("Jdbc");

        //Difference between immutable and mutable

        StringBuilder sb1 = new StringBuilder("Tom");
        sb1.append("Hanks");
        System.out.println(sb1);

        String sobj1 = "Tom";
        sobj1.concat("Hanks");
        System.out.println(sobj1);

        StringBuilder sb2 = new StringBuilder("Hanks");
        int numOfChars = sb2.length();
        System.out.println(numOfChars);//5

        int capacity = sb2.capacity();
        System.out.println(capacity);//21

        StringBuilder sb3 = new StringBuilder();
        int n = sb3.length();
        System.out.println(n);//0
        int c = sb3.capacity();
        System.out.println(c);//16

        StringBuilder sb4 = new StringBuilder();
        sb4.append("JavaJavaJavaJava").append("XXXXX");
        int d= sb4.capacity();
        System.out.println(d);//34

        //How to decide the capacity
        StringBuilder sb5 = new StringBuilder(2);
        sb5.append("FL!");
        int e  = sb5.capacity();
        System.out.println(e);

        StringBuilder sb6 = new StringBuilder("Java World");
        sb6.delete(4,10);
        System.out.println(sb6);

        StringBuilder sb7 = new StringBuilder("Java World");
        sb7.reverse();
        System.out.println(sb7);

        //How to convert a String to StringBuilder
        String str3 = "JAva";
        StringBuilder sb9 = new StringBuilder(str3);
        System.out.println(str3);//Java
        System.out.println(sb9);//avaJ

        StringBuilder sb10 = new StringBuilder("Java is love");
        sb10.substring(8);
        System.out.println(sb10);//Java is love


    }

}
