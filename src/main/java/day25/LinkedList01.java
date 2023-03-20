package day25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> linked = new LinkedList<>();

        List<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");

        //Adding operation is LinkedList
        linked.add("A");
        linked.add(0,"Bubble");
        linked.addAll(list);
        linked.addAll(1,list);
        linked.addFirst("K");
        linked.addLast("V");
        System.out.println("before removing: "+linked);

        //REmove
        System.out.println(linked.remove());//Removes the first element
        System.out.println(linked.remove("W"));//removes first occurence of element
        linked.remove(3);
        linked.removeAll(list);
        linked.removeIf(t->t.length()<2);

        linked.element();//Copy + paste the first element, if list is empty gives error
        linked.peek();  // Copy + paste the first element, if list is empty gives null
        linked.poll();  // Cut paste the first element, if the list is empty gives null


        System.out.println("After removing: "+linked);

    }


}
