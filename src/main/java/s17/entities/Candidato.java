package s17.entities;

import java.util.Objects;

public class Candidato {
    private String name;

    public Candidato(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return Objects.equals(name, candidato.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
