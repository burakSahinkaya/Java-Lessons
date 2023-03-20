package practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class pra {
    public static void main(String[] args) {

        try {
            BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\burak\\IdeaProjects\\untitled\\src\\main\\java\\practice\\text"));
            try {
                String line = file.readLine();
                while(line !=null){
                    System.out.println(line);
                    line = file.readLine();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
