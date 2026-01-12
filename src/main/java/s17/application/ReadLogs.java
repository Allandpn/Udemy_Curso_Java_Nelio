package s17.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class ReadLogs {
    public static void main(String args[]){

        String path = "s17/data/logs.txt";

        Set<String> usuarios = new HashSet<>();

        try(BufferedReader br = readFile(path)){
            String line;
            while((line = br.readLine()) != null){
                String[] l = line.split(" ");
                usuarios.add(l[0]);
        }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

        System.out.println("Usuarios individuas: "+ usuarios.size());

    }

    public static BufferedReader readFile(String path){
        InputStream iS = ReadLogs
                                .class
                                .getClassLoader()
                                .getResourceAsStream(path);

        if(iS == null){
            throw new IllegalArgumentException("arquivo nao encontrado");
        }

        return new BufferedReader(new InputStreamReader(iS, StandardCharsets.UTF_8));
    }
}
