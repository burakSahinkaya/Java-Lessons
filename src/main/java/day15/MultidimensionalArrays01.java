package day15;

import java.util.Arrays;

public class MultidimensionalArrays01 {
    public static void main(String[] args) {

        int mda [][] = new int[3][2];
        System.out.println(Arrays.deepToString(mda));

        mda[1][1]=11;
        mda[2][0]=-7;
        mda[0][0]=12;
        mda[2][1]=16;
        mda[0][1]=-3;
        mda[1][0]=5;
        System.out.println(Arrays.deepToString(mda));

        //Example 1: Find the sum of the first and the last inner array elements
        int sum = 0;
        for(int i=0;i< mda.length;i++){
            if(i==0||i==mda.length-1){
                for(int k=0;k<mda[i].length;k++){
                    sum = sum+mda[i][k];
                }
            }
        }
        System.out.println(sum);

        //Example 2 : Type code to find the total numbber of elements in the multidimentional array

        //1.way
        int mda1[][]={{5,2},{11,13,15},{6},{-2,3,5,12}};
     int total = 0;
     for(int i=0;i<mda1.length;i++){
         for(int k = 0;k<mda1[i].length;k++){
             total = total+ mda1[i][k];
         }
     }
        System.out.println(total);

     //2. way
        int total1 = 0;
        for(int[] w:mda1){
            for(int n : w){
                total1 = total1 + n;
            }
        }
        System.out.println(total1);

        //Example 3 : print the elements which has "a"in it
        String brr[][]={{"Java","is"},{"easy","to","learn"},{"if","you","study","hard"}};
        for(String[] w : brr) {
            for (String n : w) {
                if (n.contains("a")) {
                    System.out.print(n + " ");
                }
            }
        }
        System.out.println();
            //Example 4: convert 2 dimensional array to 1 dimensional array
            String crr[][]={{"Java","is"},{"easy","to","learn"},{"if","you","study","hard"}};
            //FİRSTLY
            int totalNumOfElements = 0;
            for(String[] a : crr){
                totalNumOfElements = totalNumOfElements+crr.length;
            }
            String drr[] = new String[totalNumOfElements];
            //SECONDLY
            int idx =0;
            for(String[] x : crr){
                for(String y : x ){
                    drr[idx] =y;
                    idx++;
                    }
                }
        System.out.println(Arrays.toString(drr));

            //Example 5: find the sum of max and min element in an integer
        int err[][]={{5,2},{11,13,15},{6},{-2,3,5,12}};

        //1. Way
        int max = err[0][0];
        int min = err[0][0];
        for(int[] w : err){
            for(int u : w){
                if(max<u){
                    max =u;
                }
                if(min>u){
                    min=u;
                }
            }
        }
        System.out.println(max+min);

        //2. Way
        int maxx =err[0][0];
        int minn = err[0][0];
        for(int[] w : err){
            for(int u : w){
               maxx = Math.max(maxx,u);
               minn = Math.min(minn,u);
            }
        }
        System.out.println(minn+maxx);


            }
    }

