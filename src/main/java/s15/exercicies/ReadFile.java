package s15.exercicies;

import s15.entities.Product;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReadFile {

    public static void main(String args[]) {
        Path path = Path.of("src", "main", "java", "s15", "data", "data.csv");
        List<Product> products = new ArrayList<>();
        try (BufferedReader bf = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] lines = line.split(",");
                String name = lines[0];
                double price = Double.parseDouble(lines[1]);
                int qnt = Integer.parseInt(lines[2]);
                products.add(new Product(name, price, qnt));
            }
        } catch (IOException e) {
            System.out.println("Error ao ler arquivo: " + e.getMessage());
        }

        Path pathWriter = Path.of("src", "main", "java", "s15", "data", "old2", "data.txt");
        try {
            Files.createDirectories(pathWriter.getParent());

            try (BufferedWriter bw = Files.newBufferedWriter(
                    pathWriter,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            )
            )
            {
                for (Product p : products) {
                    bw.write(p.getName() + " - " + p.getPriceTotal());
                    bw.newLine();
                }
            }
        }
        catch(IOException e){
            System.out.println("Error ao escrever arquivo: " + e.getMessage());
        }
    }
}
