package entities;

public  abstract class Pessoas {

    // ATRIBUTOS
    private String nome;
    private Double renda_anual;
    // ATRIBUTOS

    // CONSTRUTORES
    public Pessoas() {
    }

    public Pessoas(String nome, Double renda_anual) {
        this.nome = nome;
        this.renda_anual = renda_anual;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRenda_anual() {
        return renda_anual;
    }

    public void setRenda_anual(Double renda_anual) {
        this.renda_anual = renda_anual;
    }
    // ENCAPSULAMENTO

    // METODOS
    public abstract Double taxaImposto();
    // METODOS


}