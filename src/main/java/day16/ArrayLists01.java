package day16;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //Create an integer list add 5 elements in it remove the even elements change odd elements to 22
        List<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(3);
        al.add(7);
        al.add(24);
        al.add(11);
        for(int i = 0; i<al.size();i++){
            Integer element = al.get(i);
            if(element%2==0){
                al.remove(i);
                i--;
            }else{
                al.set(i,22);//set() method is for updating list elements
            }
        }
        System.out.println(al);

        //Create an integer list which has repeated elements then remove the duplicates
        //[2,3,2,2,3,5] ==> [2,3,5]
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(2);
        originalList.add(3);
        originalList.add(5);
        List<Integer> uniqueList = new ArrayList<>();

        for(Integer w : originalList){
            if(!uniqueList.contains(w)){
                uniqueList.add(w);
            }
        }
        System.out.println(uniqueList);

    }
}
