package s17.services;

import s17.entities.Entities;
import s17.entities.Product;
import s17.entities.Students;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CreateListEntities {
    public static <T extends Entities> List<T> createList(String path, Function<String[], T> factory){
        try {
            List<String> list = ConvertToList.toList(ReadData.readList(path));
            List<T> listT = new ArrayList<>();

            String[] line;
            for (String l : list) {
                line = l.split(",");
                T p = factory.apply(line);
                listT.add(p);
            }
            return listT;
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

    }

}
