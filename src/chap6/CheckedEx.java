package chap6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedEx {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
        }
    }

    static void readFile()  throws FileNotFoundException{
     
        FileReader fr = new FileReader("test.txt");
    }

}
