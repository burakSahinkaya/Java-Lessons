package day26;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    public static void main(String[] args) {
        Deque<String> dq1 = new LinkedList();
        dq1.add("As");
        dq1.add("Bt");
        dq1.add("Cu");

        //Removes and returns the first elemet of this deque
        dq1.pop();
        System.out.println(dq1);


    }

}
