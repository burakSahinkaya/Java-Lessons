package day06;

public class Day06Ternary {
    public static void main(String[] args) {
        //Type code to check if a number is positive or not
        int x = 12;
        //1.way
        if(x>0){
            System.out.println("positive");
        }else{
            System.out.println("negative");
        }

        //2.way : By using ternary
        String result = x>0 ? "positive":"negative";
        System.out.println(result);

        //Type code to check if an integer has 3 digits or not

        int y = -125;
        int z = Math.abs(y);
        String dgt3 = z>99 && z<1000 ? "has 3 digits " : "has not 3 digits";
        System.out.println(dgt3);

        //Type code to check following conditions for state abbbreviations is USA
        //1) it should have 2 charcaters 2) it should have just uppercase
        String s ="FG";

        String proper = s.length()==2 && s.replaceAll("[A-Z]","").length()==0 ? "valid":"invalid";
        System.out.println(proper);
    }
}
