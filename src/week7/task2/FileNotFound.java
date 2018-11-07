package week7.task2;

import java.awt.image.ImagingOpException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFound {
    public void test() throws FileNotFoundException {
        throw new FileNotFoundException();

    }
    public static void main(String[] args){
        try {
            FileNotFound io = new FileNotFound();
            io.test();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
