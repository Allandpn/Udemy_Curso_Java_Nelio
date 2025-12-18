package s13.entities;

public class PessoaFisica extends Pessoa{
    private double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude){
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calculaImposto(){
        double imposto = 0.0;
        if(super.getRendaAnual() < 20000.0){
            imposto = super.getRendaAnual() * 0.15;
        } else {
            imposto = super.getRendaAnual() * 0.25;
        }
        if(gastosSaude > 0){
            imposto -= gastosSaude * 0.5;
        }
        return Math.max(imposto, 0.0);
    }

}
