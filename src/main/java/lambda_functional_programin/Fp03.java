package lambda_functional_programin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {

    public static void main(String[] args) {
        List<String> l  =new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

        printInUppercase01(l);
        System.out.println();

       //printInUppercase02(l);

        printElementsSortedByLength(l);
        System.out.println();

        printElementsSortedReverseByLength(l);
        System.out.println();

        printDistinctByUsingLastCharacters(l);
        System.out.println();

        printSortedByLengthThenSortedByInitial(l);
        System.out.println();

    }

    //1)create a method to print all list elements in uppercase

    //1. way
    public static void printInUppercase01(List<String> list){
        list.stream().map(String::toUpperCase).forEach(UtilsNt::printTheSameLineWithSpace);
    }
    /*2. way
    public static void printInUppercase02(List<String> list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }*/

    //2)Crate a method to print elements after ordering according to their lengths
    public static void printElementsSortedByLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsNt::printTheSameLineWithSpace);
    }
    //3) Create a method to print the elemnents after ordering according to their lengths(in reverse)

    public static void printElementsSortedReverseByLength(List<String> list){
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsNt::printTheSameLineWithSpace);
    }
    //4) Create a method to sort the distinct elements by using their last characters
    public static void printDistinctByUsingLastCharacters(List<String> list){
        list.stream().distinct().sorted(Comparator.comparing(UtilsNt::getLastChar)).forEach(UtilsNt::printTheSameLineWithSpace);
    }
    //5)Create a method to sort the elements according to their lengths then according to their first character
    public static void printSortedByLengthThenSortedByInitial(List<String> list){
        list.stream().
                sorted(Comparator.comparing(String::length).thenComparing(UtilsNt::getFirstChar)).forEach(UtilsNt::printTheSameLineWithSpace);
    }
    //6) remove the elemetns if the length of the element is greater than 5
    public static void removeIfTheLengthGreaterThanFive(List<String> list){
        list.removeIf(t->t.length()>5);
        System.out.println(list);
    }
    //7)remove the elements if the element şs starting with 'A','a' or ending with 'N','n'
       //1.way
    public static void removeUnwantedElements01(List<String> list){
        list.removeIf(t-> t.charAt(0) =='A'|| t.charAt(0) =='a'|| t.charAt(t.length()-1) =='N'|| t.charAt(t.length()-1) =='n');
        System.out.println(list);
    }
      //2.way
      public static void removeUnwantedElements02(List<String> list){
        list.removeIf(t->t.startsWith("A")||t.endsWith("N")||t.startsWith("a")||t.endsWith("n"));
          System.out.println(list);
      }

      //Remove the elements if the length is between 8 and 10 or anding with 'o'
    public static void removeIfTheLengthBetween8_10orEndsWithO(List<String> list){
        list.removeIf((t->(t.length()>7 && t.length()<11) || t.endsWith("o")));
        System.out.println(list);
    }
}
