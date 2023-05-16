package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("File.txt");
            myWriter.write("Hemanth, Sahukari");
            myWriter.close();
            System.out.println("Successfully wrote to file.");
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }
}