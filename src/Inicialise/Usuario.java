package Inicialise;

public class Usuario {
    private String nome;
    private Integer idade;
    private double altura;

    public Usuario(String nome, Integer idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+" tem "+idade+" anos e "+altura+" de altura!";
    }
}
