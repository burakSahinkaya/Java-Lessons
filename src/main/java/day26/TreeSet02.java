package day26;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {

    /*
    Question: What do you do to store unique elements in natural order
               I Use TreeSet
    Quesiton: As you know TreeSet is slow in adding and removing elements,what do you do to make it faster
              i)Create HashSett
              ii)Add elemetns into HashSett
              iii)Convert HashSet to TreeSet
     */

    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<>();

        //1.Way
        int time1 = LocalTime.now().getNano();
        for(int  i = 1000; i>0;i--){
            hSet.add(i+"X");
        }
        TreeSet<String> tSet = new TreeSet<>(hSet);
        int time2 = LocalTime.now().getNano();

        //2.Way
        TreeSet<String> tSet2 = new TreeSet<>();
        for(int i =1000; i>0;i--){
            tSet2.add(i+"Y");
        }
        int time3 = LocalTime.now().getNano();

        System.out.println("first : "+ (time2-time1));
        System.out.println("second:  "+ (time3-time2));
    }

}
