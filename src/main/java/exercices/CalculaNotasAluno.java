package exercices;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class CalculaNotasAluno {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Aluno name:");
        String name = sc.nextLine();
        System.out.println("Digite as notas do Aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        Aluno aluno = new Aluno();
        aluno.setName(name);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        aluno.setNota3(nota3);
        aluno.calculaNotaFinal();
        aluno.verificaStatusAluno();

        System.out.println(aluno);
        if (aluno.getStatus().equals("FAILED")) {
            System.out.println("MISSING = " + aluno.calculaPontosRestantes() + " POINTS");
        }


        sc.close();
    }

}
