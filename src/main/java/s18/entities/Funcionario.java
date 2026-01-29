package s18.entities;

public class Funcionario {
    private String nome;
    private Double salario;
    private String email;

    public Funcionario(String nome,  String email, Double salario) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
