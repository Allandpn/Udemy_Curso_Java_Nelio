package s15.exercicies;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LearnOpenFile {
    public static void main(String args[]){
        File file = new File("C:\\Users\\allan.nascimento\\IdeaProjects\\CursoJavaCompleto\\Udemy_Curso_Java_Nelio\\src\\main\\java\\s15\\data\\file.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Arquivo não encontrado");
        }
        finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}
