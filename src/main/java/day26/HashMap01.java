package day26;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    /*
    1) HashMap is not-thread safe
    2)HashMap is non-synrhronized
    3) HasgMap foes not put entries in any order
    4) you can use a single null in key part
    5) You an use multiple null in values part
     */

    public static void main(String[] args) {
        HashMap<String,Integer> hMap = new HashMap<>();

        hMap.put("Tom Hanks",13);
        hMap.put("Brad Pitt",24);
        hMap.put("Angelina julie",46);
        hMap.put("Cuneyt Arkin",85);
        hMap.put("Alex Alex",33);
        System.out.println(hMap);//{Tom Hanks=13, Brad Pitt=24, Cuneyt Arkin=85, Angelina julie=46, Alex Alex=33}

        //How to work with "key"s

        //Example 1 = how many letters were used in all names
        Set<String> keys = hMap.keySet();

        int totalNumOfLetters = 0;
        for(String w: keys){
            totalNumOfLetters = totalNumOfLetters + w.replaceAll("[^A-Za-z]","").length();
        }

        System.out.println(totalNumOfLetters);

                    //How to work with values
        //Example 2: Finf the average age of the students

        Collection<Integer> values =  hMap.values();

        int sum = 0;
        for(Integer w : values){
            sum = sum +w;
        }
        double avg = sum/values.size();
        System.out.println(avg);

                    //How to get a specific value
        Integer age1 = hMap.get("Cuneyt Arkin");
        System.out.println(age1);//85

        Integer age2 = hMap.getOrDefault("Cuneyt ArkinXl",0);
        System.out.println(age2);//0

        hMap.putIfAbsent("Angelina Jolie",32);
        System.out.println(hMap);//this method puts the entry in map if entry does not exist

        //How to get entries from a map
        Set<Map.Entry<String,Integer>> entries = hMap.entrySet();
        System.out.println(entries);//[Tom Hanks=13, Brad Pitt=24, Angelina Jolie=32, Cuneyt Arkin=85, Angelina julie=46, Alex Alex=33]


        //Exampel 3: Get the Inıtals of fırst 3 entries
        String initals ="";
        int counter = 0;

        for(Map.Entry<String,Integer> w : entries){
            initals = initals + w.getKey().charAt(0);
            counter++;
            if(counter ==3){
                break;
            }
        }

        System.out.println(initals);

        boolean exist1 = hMap.containsKey("Angelina Julie");
        System.out.println(exist1);

        boolean exist2 = hMap.containsValue(85);
        System.out.println(exist2);

        // Replace after checking key and value
        hMap.replace("Cuneyt Arkin",85,63);
        Integer age9 = hMap.get("Cuneyt Arkin");
        System.out.println(age9);//63

        //Replace after just checking key
        hMap.replace("Alex Alex",44);
        Integer newAge = hMap.get("Alex Alex");
        System.out.println(newAge);//44

    }
}
