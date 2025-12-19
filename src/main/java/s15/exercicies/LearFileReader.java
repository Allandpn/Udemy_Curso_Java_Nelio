package s15.exercicies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LearFileReader {
    public static void main(String args[]) {
        String path = "C:\\Users\\allan\\IdeaProjects\\curso_nelio\\src\\main\\java\\s15\\data\\file.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while((line= br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
