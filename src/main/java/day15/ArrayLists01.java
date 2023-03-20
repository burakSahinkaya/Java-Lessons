package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayLists01 {
    /*
    1)Arrays are fixed in length whc is not good but  Lists are flexivle in length which s good
    2)Arrays can store just primitives and references but lists can store non-primitive
    3)Arrays are faster than Lists
    4)Arrays user memory less than lists
     */
    public static void main(String[] args) {

        //How to create a List(ArrayList)
        //1.Way: Mostly used
        List<Integer> aList= new ArrayList<>();
        //2.Way : it is true to use
        ArrayList<Integer> bList= new ArrayList<>();

        //How to print a list on the console
        System.out.println(aList);

        //How to add elements into List
        aList.add(12);
        aList.add(21);
        aList.add(5);

        aList.add(2,99);
        aList.add(4,88);
        System.out.println(aList);

        //How to get the number of elements
        int numOfElements  =aList.size();
        System.out.println(numOfElements);

        //How to get a specific lement from a list by using index
        int el = aList.get(3);
        System.out.println(el);

        //Create a List and add even integers between 13 and 51 in descending order
        //Then print just the 7th element on the console
        List<Integer> clist = new ArrayList<>();
        for(int i = 51;i>12;i--){
            if(i%2==0){
                clist.add(i);
            }
        }
        System.out.println(clist.get(6));

        //How to remove a specific element
        List<String> dList = new ArrayList<>();
        dList.add("A");
        dList.add("C");
        dList.add("C");
        dList.add("B");
        dList.add("E");
        dList.remove("C");
        System.out.println(clist);

        List<Integer> fList = new ArrayList<>();
        fList.add(12);
        fList.add(21);
        fList.add(32);
        fList.add(45);
        //remove 21 from the list fList
        //1.Way : to remove specific integer element from a list user indexOf() inside of the remove()
        fList.remove(fList.indexOf(21));

        //2.Way: to remove a specific integer element from a list convert it to a wrapper class
        fList.remove((Integer)32);

        //Create a String list add elements into it then remove the elements  end with a and starts with m
        List<String> gList = new ArrayList<>();
        gList.add("Maria");
        gList.add("Mandalena");
        gList.add("Karenina");
        gList.add("Mexico");
        gList.add("Casablanca");

        for(int i = 0 ;i<gList.size();i++){
            String element =gList.get(i);
            if(element.startsWith("M") && element.endsWith("a")){
                gList.remove(element);
                i--;//After removing any element Java decreses the indexes of remaining elements
            }
        }
        System.out.println(gList);




    }
}
