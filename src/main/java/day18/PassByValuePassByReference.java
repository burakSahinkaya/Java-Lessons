package day18;

public class PassByValuePassByReference {

    /*
    1) Java creates copy of values int method calls to protect original value of cariables.
    That process is called "Pass By Value".
    2) By the help of the pass by value we are ables to protect original variable

     */
    public static void main(String[] args) {

        int shirt = 100;

        System.out.println(doDiscount("veteran", shirt));
        System.out.println(doDiscount("student", shirt));
        System.out.println(doDiscount("seniors", shirt));

        String greeting = "wooow";
        System.out.println(addExclamation(greeting));

    }

    public static int doDiscount(String status, int price){

        switch(status){
            case "student":
             price = price -10;
             break;
            case "veteran":
                price = price-20;
                break;
            case "seniors":
                price = price-5;
                break;
            default:
                price = price;
        }
        return price;

    }
    public static String addExclamation(String greetings ){
        return greetings+ "!";
    }

}
