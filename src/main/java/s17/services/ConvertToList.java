package s17.services;

import s17.entities.Entities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ConvertToList {
    public static List<String> toList(InputStream iS){
        List<String> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(iS, StandardCharsets.UTF_8))) {
            String line;
            while((line = br.readLine()) != null){
                list.add(line);
            }
            return list;
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
