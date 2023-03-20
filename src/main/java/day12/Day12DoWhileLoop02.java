package day12;

import java.util.Scanner;

public class Day12DoWhileLoop02 {
    public static void main(String[] args) {
        /*
              username is "admin" , password is "pwd123"
          ask a user to enter usernam and password
          user should see "enter your username and password" message
          if he enters correct he should get " you are in your account"
          otherwise he should see"enter your username and password" message 3 times
          after 3 times he should get " your account is blocked
         */
        Scanner input = new Scanner(System.in);
        String userName = "admin";
        String password = "pwd123";
        //1.way
        int k = 0;
            do {
                System.out.println("enter your username and password ");
                String usUsername = input.next();
                String usPassword = input.next();

                if (usUsername.equals(userName) && usPassword.equals(password)) {
                    System.out.println("you are in your account");
                    break;
                }else{
                    k++;
                }

            } while (k<3);
        if( k==3){
            System.out.println("your account is blocked");
        }


        //2. way
        int counter = 0;
        do{
            if(counter==3){
                System.out.println("your account is blocked");
                break;
            }
            System.out.println("enter username..");
            String u =input.next();
            System.out.println("enter password");
            String p = input.next();
            counter++;
            if(u.equals(userName) && p.equals(password)){
                System.out.println("you are in your account");
                break;
            }
        }while (true);


    }
}
