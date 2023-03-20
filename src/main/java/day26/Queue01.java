package day26;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    /*
    1)"FIFO" means first in first out, if ou need a functionality contains "FIFO"
       prefer to use "Queue"
     */

    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        q1.add("Rick");
        q1.add("Maggie");
        q1.add("Glenn");
        q1.add("Megan");
        q1.add("Daryl");

        System.out.println(q1);//[Rick, Maggie, Glenn, Megan, Daryl]

        ///Retrives but dont remove the head of queue
        //ıf this queue is empty, it throws noSuchElementExeption
        System.out.println(q1.element());//Rick

        //Retrieves but does not remove the head of queue, or returns null if this queue is empty
        System.out.println(q1.peek());//Rick



        //ınserts the specified element into this queue if it is possible to do so immediately
        //  without violating capacity restriction
        //When using capacity restricted queue, this method is generally preferable to add,
        //  which can fail to insert an element only by throwing exception.
        q1.offer("XXXXX");
        System.out.println(q1);

        //Retrieves and removes the head of this queue, or returns null if the queue is empty
        q1.poll();
        System.out.println(q1);//[Maggie, Glenn, Megan, Daryl, XXXXX]

        //When you use PriorityQueue<>() construcotr it is possible to create sorting logic
        Queue<String> q2 = new PriorityQueue<>();
        q2.add("Rick");
        q2.add("Maggie");
        q2.add("Glenn");
        q2.add("Megan");
        q2.add("Daryl");

        System.out.println(q2);//[Daryl, Glenn, Maggie, Rick, Megan]


    }

}
