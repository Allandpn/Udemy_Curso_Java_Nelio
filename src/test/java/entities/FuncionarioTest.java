package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {
    @Test
    public void testarCalculoSalarioLiquido() {
        Funcionario f = new Funcionario();
        f.setName("test");
        f.setGrossSalary(100);
        f.setTax(10);

        assertEquals(90, f.netSalary(), 0.0001);
    }

    @Test
    public void testarAlteracaoPorcentagemSalario() {
        Funcionario f = new Funcionario();
        f.setName("test");
        f.setGrossSalary(100);
        f.setTax(10);

        f.increaseSalary(10);

        assertEquals(100,f.netSalary(), 0.0001);
    }

}
