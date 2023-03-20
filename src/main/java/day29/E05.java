package day29;

public class E05 {

    /*
       What is the difference between "exception" and "error"?
       1)Exceptions can be handled, your application can work after handling Exception
        Error can not be handled your app can not work after getting any error
     Note 1: "Exception"s and "Errors" are the child of "Throwable"
      Common errors: i)OutOfMemoryError: it occurs if the memory is full
                     ii)StackOverflowError: It occurs if the stack memory is full
                     iii)LinkageError: It occurs if the dependant class has any issue

      Custom Exceptions: we can create our own exception classes, they can be "checked"(CTE) or "unchecked"(Run time) exception
                        i) To be able to create custom excepitons gives us flexibility
                        ii)To be able to create custom exceptions protect the app from developer mistakes
     */

    public static void main(String[] args) throws IllegalGradeException {

        int grade = 120;
        if(grade>100 || grade<0){
            throw new IllegalGradeException("Grades mmust be from 0 to 100");
        }else{
            System.out.println("your grade is "+ grade);
        }
        int age = -12;
        if(age<0){
            throw new IllegalAgeException("your age can  not be less then 0");
        }else{
            System.out.println("your age is : "+ age);
        }
    }

}
//How to create custom checked exception class
/*
  1)Make the class child of the Exception class
  2)Use String message parameter in the constructor
  3)Create toString() method to be able to see message when the exception was thrown
 */

class IllegalGradeException extends Exception{

    String message ;
    public IllegalGradeException(String message){
        this.message = message;
    }
    public String toString(){
        return message;
    }

}
//How to create custom checked exception class
class IllegalAgeException extends RuntimeException {

    String message;

    public IllegalAgeException(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}



