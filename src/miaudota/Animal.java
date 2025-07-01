package miaudota;

import java.util.Date;

public abstract class Animal {
    protected int id;
    protected String nome;
    protected String raca;
    protected int idade;
    protected String sexo;
    protected String porte;
    protected double peso;
    protected String cor;
    protected String descricao;
    protected Date dataCadastro;
    protected boolean vacinado;
    protected boolean castrado;

    public Animal(int id, String nome, String raca, int idade, String sexo, String porte, double peso, String cor, String descricao, Date dataCadastro, boolean vacinado, boolean castrado) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.porte = porte;
        this.peso = peso;
        this.cor = cor;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.vacinado = vacinado;
        this.castrado = castrado;
    }
}
