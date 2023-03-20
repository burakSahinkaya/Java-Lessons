package day28;

public class E06 {

    public static void main(String[] args) {
        Object obj = 70;
        convertObjectToString(obj);//ClassCastException


    }
    public static void convertObjectToString(Object obj){
        try {
            String s = (String) obj;
            System.out.println(s);
        }catch (ClassCastException e){
            System.out.println("Object class can not be converted to  string class");
        }finally {
            System.out.println("break the connection");
        }
    }

}
