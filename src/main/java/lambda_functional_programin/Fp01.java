package lambda_functional_programin;
/*

    1)Lambda is Functiopnal programming, we started to use lambda in java 8
    2)In Functional programming we focus on "what to do",but in structured programming we focus "How to do"
    3)Functional programming van be used just with arrays and collections
    4)By using "entryset()" method convert Map to Set, then you can use functional programming in Maps


 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);

        printElementsStructered(l);
        System.out.println();

        printElementFunctional(l);
        System.out.println();

        printtheevenelementsStructured(l);
        System.out.println();

        printtheevenelementsFunctional(l);
        System.out.println();

        printSquareOfOddNumbers(l);
        System.out.println();

        printCubeOfDistinctOddNumbers(l);
        System.out.println();

        sumOfTheSquareOfDistinctEvenElements(l);

        productOfTheCubersOfDistinctEvenElements(l);

        getMaxElement01(l);

        getMaxElement02(l);

        getMinElement01(l);

        getMinElement02(l);

        getMinElement03(l);

        getMinEvenGreaterThanSevenElement01(l);

        getMinEvenGreaterThanSevenElement02(l);

        getMinEvenGreaterThanSevenElement03(l);

        halfOfTheElementsWhichAreDistinctAndGreaterThanFiveInReverse(l);

    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //   between two consecutive elements.(Structured)

    public static void printElementsStructered(List<Integer> list){

        for(Integer w : list){
            System.out.print(w+" ");
        }

    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //   between two consecutive elements.(Functional)

    public static void printElementFunctional(List<Integer> list){

        list.stream().forEach(t-> System.out.print(t+" "));

    }

    //2)Create a method to print the even list elements on the console in the same line with space
    //  between two consecutive elements(Structured)
    public static void printtheevenelementsStructured(List<Integer> list){
        for(Integer w : list){
            if(w%2==0){
                System.out.print(w +" ");
            }
        }
    }
    //2)Create a method to print the even list elements on the console in the same line with space
    //  between two consecutive elements(Functional)

    public static void printtheevenelementsFunctional(List<Integer> list){

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));

    }

    //3)Create a method to print the square of add list elements on the console in the same line with a
    //  space between two consecutive elements(Functional)
    public static void printSquareOfOddNumbers(List<Integer> list){
        list.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in teh same line
    //  with a space between two consecutive elements.

    public static void printCubeOfDistinctOddNumbers(List<Integer> list){
        list.stream().distinct().filter(t->t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t+" "));
        // I am using distinct before filter because java will have fewer elements to calculate
    }

    //5)Create a method to calculate the sum of the squares of  distinct even elements
    public static void sumOfTheSquareOfDistinctEvenElements(List<Integer> list){

        Integer sum = list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)-> t+u);
        System.out.println(sum);
    }

    //6) Create a new method to calculate the  product of the cubes of distinct even elements
    public static void productOfTheCubersOfDistinctEvenElements(List<Integer> list){
        Integer product = list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(product);
    }

    //7)Create a method to find the maximum value from the list elements
    public static void getMaxElement01(List<Integer> list){
       Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t: u);
        System.out.println(max);
    }
       //2. wya
       public static void getMaxElement02(List<Integer> list){
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
           System.out.println(max);
       }

    //Homework
    //8)Create  a method to find the minimum value form the lists elements(in 2 ways)
    public static void getMinElement01(List<Integer> list){
        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t:u);
        System.out.println(min);
    }

       //2.Way
       public static void getMinElement02(List<Integer> list){
        Integer min = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
           System.out.println(min);
       }
       //3.way
       public static void getMinElement03(List<Integer> list){
        Integer min = list.stream().distinct().sorted().findFirst().get();
           System.out.println(min);
       }

    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void getMinEvenGreaterThanSevenElement01(List<Integer> list){
       Integer minn= list.stream().filter(t->t>7).filter(t->t%2==0).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println(minn);
    }
    //2.way
    public static void getMinEvenGreaterThanSevenElement02(List<Integer> list){
        list.stream().distinct().filter(t->t>7).filter(t->t%2==0).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t, u)->u);
    }
    //3.way
    public static void getMinEvenGreaterThanSevenElement03(List<Integer> list){
       Integer minn = list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(minn);
    }

    //10)Create a method to find the half of the element which are distinct and greate than 5
    //  in reverse order in the list

    public static void halfOfTheElementsWhichAreDistinctAndGreaterThanFiveInReverse(List<Integer> list){
        List<Double> result = list.stream().
                distinct().
                filter(t->t>5).
                map(t->t/2.0).sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(result);
    }
}
