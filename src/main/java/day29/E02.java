package day29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

    /*
    1) throw keyword is used in method signature line
    2) If you use child and parent after "throws" keyword,Java will let you use the parent
    3) After "throws"  keyword multiple exceptions can be used
    4) After "throws"  keyword, we do not use "new" keybord and constructor we use just the exception class
    5)"FileNotFoundExcepiton" is thrown bt java if the path is wrong or if the file does not exist
    6)"IOexception" handels all issues related with input and output operations
    7)IOExcpeption is parent of "FileNotFoundExcepiton"
     */

    public static void main(String[] args) throws IOException {

        FileInputStream fis =new FileInputStream("src\\main\\java\\day29\\TextFile01");

        int i = 0;
        while((i = fis.read()) != -1){
            System.out.print((char) i);
        }

    }

}
