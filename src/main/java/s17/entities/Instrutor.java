package s17.entities;

import java.util.ArrayList;
import java.util.List;

public class Instrutor {
    private String nome;
    private int matricula;
    private List<Curso> cursos = new ArrayList<>();

    public Instrutor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

}
