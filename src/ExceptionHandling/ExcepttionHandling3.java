package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcepttionHandling3 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream fis = new FileInputStream("D:\\myFile1.txt");
        }
        catch (Exception e)
        {

        }
        System.out.println("End of the program");
    }

}
