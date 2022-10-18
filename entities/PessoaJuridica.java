package entities;

public class PessoaJuridica extends Pessoas{

    // ATRIBUTOS
    private int num_funcionarios;
    // ATRIBUTOS

    // CONSTRUTORES
    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double renda_anual, int num_funcionarios) {
        super(nome, renda_anual);
        this.num_funcionarios = num_funcionarios;
    }
    // CONSTRUTORES

    
    // ENCAPSULAMENTO
    public int getNum_funcionarios() {
        return num_funcionarios;
    }

    public void setNum_funcionarios(int num_funcionarios) {
        this.num_funcionarios = num_funcionarios;
    }
    // ENCAPSULAMENTO

    
    // METODOS
    @Override
    public Double taxaImposto() {
        Double taxa;
        if (num_funcionarios <= 10) {
            taxa = getRenda_anual() * 0.16;
        }
        else {
            taxa = getRenda_anual() * 0.14;
        }
        return taxa;
    }
    // METODOS


}
