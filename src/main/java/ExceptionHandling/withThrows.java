package ExceptionHandling;

import java.io.*;

public class withThrows {
    // declareing the type of exception
    public static void findFile() throws IOException {

        // code that may generate IOException
        File newFile = new File("File.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }

    public static void main(String[] args) {
        try {
            findFile();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}