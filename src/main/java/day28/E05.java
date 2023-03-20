package day28;

public class E05 {

    /*
    If there is parent child relationship between exception classes and

     */

    public static void main(String[] args) {

        String str = "I love java";
        getCharacterFromStringByIndex(str,4);//v

        String st = "I love java";
        getCharacterFromStringByIndex(st,12);//StringIndexOutOfBoundsException

        String s = null;
        getCharacterFromStringByIndex(s,0);//NullPointerException


    }
    public static void getCharacterFromStringByIndex(String s, int idx){
        try {
            System.out.println(s.charAt(idx));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("there is  no such index ==> "+ e.getMessage());
        }catch (NullPointerException e){
            System.out.println("You can not use null as a string "+ e.getMessage());
        }finally {
            System.out.println("break the connection");
        }
    }

}
