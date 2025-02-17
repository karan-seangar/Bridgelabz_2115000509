import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;

public class File_Reading_Efficiency {
    public static void main(String[] args) {
        String filePath = "input.txt"; 

        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.read() != -1) {
        
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + " ms");

        
        startTime = System.currentTimeMillis();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            while (bufferedReader.read() != -1) {
               
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + " ms");
    }
}

