package entities;

public class PessoaFisica extends Pessoas{
    
    // ATRIBUTOS
    private Double gasto_saude;
    // ATRIBUTOS

    // CONSTRUTORES
    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double renda_anual, Double gasto_saude) {
        super(nome, renda_anual);
        this.gasto_saude = gasto_saude;
    }
    // CONSTRUTORES


    // ENCAPSULAMENTO
    public Double getGasto_saude() {
        return gasto_saude;
    }

    public void setGasto_saude(Double gasto_saude) {
        this.gasto_saude = gasto_saude;
    }
    // ENCAPSULAMENTO


    // METODOS
    @Override
    public Double taxaImposto() {
        double taxa;
        if (getRenda_anual() < 20000) {
            taxa = getRenda_anual() * 0.15;
    
        }
        else if (getRenda_anual() >= 20000) {
            taxa = getRenda_anual() * 0.25;
        }
        else {
            taxa = 0.0;
        }
        taxa -= getGasto_saude() * 0.5;
        return taxa;
    }
    // METODOS


}
