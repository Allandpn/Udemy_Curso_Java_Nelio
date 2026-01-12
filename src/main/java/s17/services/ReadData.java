package s17.services;


import java.io.IOException;
import java.io.InputStream;


public class ReadData {

    public static InputStream readList(String path) throws IOException {

        InputStream iS = ReadData
                .class
                .getClassLoader()
                .getResourceAsStream(path);
        if(iS == null) {
            throw new IllegalStateException("Recurso não encontrado no caminho: " + path);
        }

        return iS;
    }
}
