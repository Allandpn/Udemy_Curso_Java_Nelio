package s17.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private String nome;
    private int numero;
    private List<Curso> cursos = new ArrayList<>();

    public Aluno(String nome,  int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return numero == aluno.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
