package s17.application;

import s17.entities.Aluno;
import s17.entities.Curso;
import s17.entities.Instrutor;

import java.util.*;

public class GestaoCursos {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] listCurse = {"A", "B", "C"};
        int[] codigoCurses = {1, 2, 3};
        List<Curso> cursos = new ArrayList<>();

        int[] listAlunos = {13, 21, 35, 22, 42, 50};
        List<Aluno> alunos = new ArrayList<>();
        for(int i = 0; i < listAlunos.length; i++){
            Aluno aluno = new Aluno("Aluno " + listAlunos[i], listAlunos[i]);
            alunos.add(aluno);
        }

        Instrutor instrutor = new Instrutor("Alex", 123);

        for(int i = 0; i< 3; i++){
            Curso curso = new Curso(listCurse[i], codigoCurses[i], instrutor);
            curso.setInstrutor(instrutor);
            System.out.println("How many students for course " + listCurse[i]);
            int qnt = Integer.parseInt(sc.nextLine());
            for(int j = 0; j < qnt; j++){
                int number = Integer.parseInt(sc.nextLine());
                Aluno aluno = alunos.stream().filter(x -> x.getNumero()==number).findFirst().orElse(null);
                System.out.println(aluno.getNumero());
                aluno.getCursos().add(curso);
                instrutor.getCursos().add(curso);
                curso.getAlunos().add(aluno);
            }
            cursos.add(curso);
        }


        Set<Aluno> alunosSet = new HashSet<>();

         for(Curso c : cursos){
             alunosSet.addAll(c.getAlunos());
         }

        System.out.println("Total students: " + alunosSet.size());



        sc.close();
    }
}
