package s15.exercicies;

import java.io.File;
import java.time.Instant;

public class LearnHandleDir {
    public static void main(String args[]) {
        String ph = "C:\\Users\\allan\\IdeaProjects\\curso_nelio\\src\\main\\java\\s15";
        File path = new File(ph);
        File[] folders = path.listFiles(file -> file.isDirectory());
        for(File folder : folders){
            System.out.println(folder);
        }
        File path2 = new File(ph + "//exercicies");
        File[] files = path2.listFiles(File::isFile);
        for(File file : files){
            System.out.println(file.getName());
            System.out.println(file.getParent());
            System.out.println(file.getPath());
            System.out.println(Instant.ofEpochMilli(file.lastModified()));
        }
    }
}
