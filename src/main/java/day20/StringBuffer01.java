package day20;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StringBuffer01 {

    public static void main(String[] args) {

        /*
        1)String class gives you immutable Strings, if you need mutable Strings you can user Stringbuilder or Stringbuffer
        2) when java was created, java created StringBuffer class. But then in java 1.5, StringBuilder came to the stage
        3)StringBuffer class is multi-thread and syncronized but StringBuilder is not multi-thread and sychronised
           Java did that to provide faster mutable Strings to developers.
        4) When to use string, StringBuilder, StringBuffer?
        String : if you want to operate with small amount of data use String
        StringBuilder : if you need single thread operation with large data in fast pace use StringBuilder
        StringBuffer : Multi-thread operations with large amount of data needs StringBuffer
         */

        String str = "Java";
        LocalDateTime time1 = LocalDateTime.now();
        performanceOfStringBuffer(str);
        LocalDateTime time2 = LocalDateTime.now();
        performanceOfStringBuilder(str);
        LocalDateTime time3 = LocalDateTime.now();

        System.out.println("StringBuffer time : "+time1.until(time2, ChronoUnit.NANOS));
        System.out.println("StringBuilder time : "+time2.until(time3,ChronoUnit.NANOS));

    }

    public static StringBuffer performanceOfStringBuffer(String str){
        StringBuffer strBuffer = new StringBuffer(str);
        for(int i = 0; i<10000;i++){
            strBuffer.append("abc");
        }
        return strBuffer;
    }

    public static StringBuilder performanceOfStringBuilder(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        for(int i = 0; i<10000;i++){
            strBuilder.append("abc");
        }
        return strBuilder;
    }
}
