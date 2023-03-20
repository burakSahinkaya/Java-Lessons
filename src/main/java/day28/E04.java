package day28;

public class E04 {

    // 1)try block can not be used alone, can be used with 1 or more catch block
    // 2)try block can not be used alone can be used with finally block
    public static void main(String[] args) {

        convertStringToIntegerThenDivideByGivenNumber("2314",2); //2315
        convertStringToIntegerThenDivideByGivenNumber("alla beni",3); //NumberFormatException
        convertStringToIntegerThenDivideByGivenNumber("12",0);//ArithmeticException

    }

    public static void convertStringToIntegerThenDivideByGivenNumber (String s, int num) {
        try {
            System.out.println(Integer.parseInt(s)/num);
        }catch (NumberFormatException e){
            System.err.println(e.getMessage()+" you have to enter a number ");
        }catch (ArithmeticException e){
            System.err.println(e.getMessage()+ " Issue occurred in division part");
        }finally {
            System.out.println("break the connection");
        }

    }


}
