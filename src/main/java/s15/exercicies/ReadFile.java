package s15.exercicies;

import s15.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String args[]) {

        File path = new File("C:\\Users\\allan.nascimento\\IdeaProjects\\CursoJavaCompleto\\Udemy_Curso_Java_Nelio\\src\\main\\java\\s15\\data\\data.csv");

        List<Product> products = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line;
            while((line = bf.readLine()) != null){
                String[] lines = line.split(",");
                String name = lines[0];
                double price = Double.parseDouble(lines[1]);
                int qnt = Integer.parseInt(lines[2]);
                double priceTotal = price * qnt;
                products.add(new Product(name, price, qnt, priceTotal));
            }
        }
        catch(FileNotFoundException e){
                throw new RuntimeException(e);
            }
        catch(IOException e){
                System.out.println(e.getMessage());
            }

        File pathWriter = new File("C:\\Users\\allan.nascimento\\IdeaProjects\\CursoJavaCompleto\\Udemy_Curso_Java_Nelio\\src\\main\\java\\s15\\data\\data2.csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathWriter))){
            for(Product p : products){
                bw.write(p.toString());
                bw.newLine();
            }

        }
        catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
