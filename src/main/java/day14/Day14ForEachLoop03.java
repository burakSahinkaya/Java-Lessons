package day14;

import java.util.Arrays;
import java.util.Scanner;

public class Day14ForEachLoop03 {
    public static void main(String[] args) {

        //Check if the array elements in natural order
        String arr[]={"A","C","B"};

        //1. way: by using loops
        String copyOfArr[] = new String[arr.length];
        int idx = 0;
        for(String w: arr){
            copyOfArr[idx]=w;
            idx++;
        }
        Arrays.sort(copyOfArr);
        if(copyOfArr.equals(arr)){
            System.out.println("array elements in alphabetical order");
        }else{
            System.out.println("arrays are not in alphabetical order");
        }

        //2.way by using existed method
        String coppyOfArr2[] = Arrays.copyOf(arr,arr.length);
        Arrays.sort(coppyOfArr2);
        if(copyOfArr.equals(arr)){
            System.out.println("array elements in alphabetical order");
        }else{
            System.out.println("arrays are not in alphabetical order");
        }

        //binarySearch() method in Array class: İts used to check of an element in an array

        int brr[]={12,13,5,11,-2};
        //it is mendatory to be able to get meaningful from binarySearch()
        Arrays.sort(brr);
        int response = Arrays.binarySearch(brr,13);//binarySearch() returns the index, if the elements exist
        System.out.println(response);

        //Check if an specific element exist in an array
        //if element exist return the index element
        //if the element does not exist return a message
        int crr[]={13,41,2,543};
        Arrays.sort(crr);
        Scanner input = new Scanner(System.in);
        System.out.println("enter an element to search in  array");
        int i = input.nextInt();
        Arrays.sort(crr);
        int existOrNot =Arrays.binarySearch(crr,i);
        if(existOrNot<0){
            System.out.println(i+" element does not exist");
        }else{
            System.out.println("element's index is "+existOrNot);
        }

    }
}
