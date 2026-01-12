package s17.application;
import s17.entities.Candidato;
import java.io.*;
import java.util.HashMap;
import java.util.Map;


public class AppRegistroVotos {
    public static void main(String args[]){
        String path = "s17/data/contagemVotos.csv";
        InputStream iS = AppRegistroVotos.class.getClassLoader().getResourceAsStream(path);

        if(iS == null){
            throw new IllegalArgumentException("Arquivo não encontrado");
        }

        Map<Candidato, Integer> candidatos = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(iS))){
            String l;
            while((l = br.readLine()) != null){
                String[] line = l.split(",");
                Candidato candidato = new Candidato(line[0]);
                int votos = candidatos.getOrDefault(candidato, 0);
                candidatos.put(candidato, votos + Integer.parseInt(line[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("CONTAGEM DOS VOTOS: ");
        for(Map.Entry<Candidato, Integer> kV : candidatos.entrySet()){
            System.out.println("Candidato: " + kV.getKey().getName() + " - Votos: " + kV.getValue());
        }

    }
}
