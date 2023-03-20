package lambda_functional_programin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {

    /*
    1) "variable or variables or zero variable" -> "logic"
        The structure is called lambda expression
    2) In functional programming, we can use lambda expression, it is allowed but not recommended
       Instead of lambda expression we prefer to use method reference
    3) Method reference is "Class Name :: Method Name"
       for example : "String :: length" (Do not type method parenthesis,type just method name)
                     "Arrays :: toString"
        You can use your own class as well, for example you created animal class and you have eat() method
        "Animal :: eat"
     */

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

        printElementFunctional(l);
        System.out.println();

        printTheEvenElementsFunctional(l);
        System.out.println();

        printSquareOfOddNumbers(l);
        System.out.println();

        printCubeOfDistinctOddNumbers(l);
        System.out.println();

        sumOfTheSquareOfDistinctEvenElements(l);

        productOfTheCubersOfDistinctEvenElements(l);

        getMaxElement01(l);

        getMinElement01(l);

        getMinEvenGreaterThanSevenElement01(l);

        halfOfTheElementsWhichAreDistinctAndGreaterThanFiveInReverse(l);

    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //   between two consecutive elements.(Functional with method reference)

    public static void printElementFunctional(List<Integer> list){
        list.stream().forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //2)Create a method to print the even list elements on the console in the same line with space
    //  between two consecutive elements(Functional with method reference)

    public static void printTheEvenElementsFunctional(List<Integer> list) {
        list.stream().filter(UtilsNt::checkToBeEven).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements(Functional)
    public static void printSquareOfOddNumbers(List<Integer> list){
        list.stream().filter(UtilsNt::checkToBeOdd).map(UtilsNt::square).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in teh same line
    //  with a space between two consecutive elements.

    public static void printCubeOfDistinctOddNumbers(List<Integer> list){
        list.stream().distinct().filter(UtilsNt::checkToBeOdd).map(UtilsNt::cube).forEach(UtilsNt::printTheSameLineWithSpace);
    }

    //5)Create a method to calculate the sum of the squares of  distinct even elements
    public static void sumOfTheSquareOfDistinctEvenElements(List<Integer> list){
      Integer sum =   list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::square).reduce(0,Math::addExact);
        System.out.println(sum);
    }

    //6) Create a new method to calculate the  product of the cubes of distinct even elements
    public static void productOfTheCubersOfDistinctEvenElements(List<Integer> list){
      Integer product =  list.stream().distinct().filter(UtilsNt::checkToBeEven).map(UtilsNt::cube).reduce(1,Math::multiplyExact);
        System.out.println(product);
    }
    //7)Create a method to find the maximum value from the list elements
    public static void getMaxElement01(List<Integer> list){
        int max = list.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
        System.out.println(max);
    }
    //Homework
    //8)Create  a method to find the minimum value form the lists elements(Method refernce)
    public static void getMinElement01(List<Integer> list){
        int min = list.stream().distinct().sorted().findFirst().get();
        System.out.println(min);
    }
    //9)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void getMinEvenGreaterThanSevenElement01(List<Integer> list){
     int min = list.stream().distinct().filter(UtilsNt::checkToBeEven).filter(t-> t>7).sorted().findFirst().get();
        System.out.println(min);
    }
    //10)Create a method to find the half of the element which are distinct and greate than 5
    //  in reverse order in the list
    public static void halfOfTheElementsWhichAreDistinctAndGreaterThanFiveInReverse(List<Integer> list){
     list.stream().distinct().filter(t->t>5).map(UtilsNt::half).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(UtilsNt::printTheSameLineWithSpace);

    }
}
