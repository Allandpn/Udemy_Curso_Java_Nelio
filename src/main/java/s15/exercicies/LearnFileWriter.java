package s15.exercicies;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class LearnFileWriter {
    public static void main(String args[]) {
        String path = "C:\\Users\\allan\\IdeaProjects\\curso_nelio\\src\\main\\java\\s15\\data\\file2.txt";

        String[] strings = new String[] {"Good", "Bad", "Ugly", "Fully"};

        try(BufferedWriter fw = new BufferedWriter(new FileWriter(path, Charset.forName("UTF-8"),true ))){
            for(String s : strings){
                fw.write(s);
                fw.newLine();
            }
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
