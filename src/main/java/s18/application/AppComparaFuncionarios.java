package s18.application;

import s18.entities.Funcionario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AppComparaFuncionarios {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        List<Funcionario> listF = new ArrayList<>();

        String path = "s18.data/funcionarios.csv";
        InputStream iS = AppComparaFuncionarios.class.getClassLoader().getResourceAsStream(path);
        if(iS == null){
            throw new IllegalArgumentException();
        }
        try(BufferedReader br = new BufferedReader(new InputStreamReader(iS))){
            String _line;
            while((_line = br.readLine())!= null){
                String[] line = _line.split(",");
                listF.add(new Funcionario(line[0], line[1], Double.parseDouble(line[2])));
            }
        }
        catch(IOException e){
            throw new RuntimeException(e);
        }

        System.out.println("Valor Salario: ");
        double salarioBase = Double.parseDouble(sc.nextLine());

        Comparator<String> comp1 = String::compareTo;

        List<String> listEmail = listF.stream().filter(p -> p.getSalario() > salarioBase).map(Funcionario::getEmail).sorted(Comparator.reverseOrder()).toList();

        System.out.println("LISTA EMAILS:");
        listEmail.forEach(System.out::println);

        double somaSalario = listF.stream().filter(x -> x.getNome().charAt(0) == 'A').map(x -> x.getSalario()).reduce(0.0, Double::sum);

        System.out.println("SOMA SALARIO: \n" + somaSalario);
        sc.close();
    }
}
