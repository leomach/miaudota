package miaudota;

import java.util.Date;

public class Pet {
    int id_Pet;
    int id_Tutor;
    String nome;
    String especie;
    String raca;
    int idade;
    String sexo;
    String porte;
    double peso;
    String cor;
    String descricao;
    Date data_Cadastro;
    String status_Adocao;
    boolean historico_Saude;
    boolean vacinado;
    boolean castrado;

    public Pet(int id_Pet, int id_Tutor, String nome, String especie, String raca, int idade, String sexo, String porte, double peso, String cor, String descricao, Date data_Cadastro, String status_Adocao, boolean historico_Saude, boolean vacinado, boolean castrado) {
        this.id_Pet = id_Pet;
        this.id_Tutor = id_Tutor;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.porte = porte;
        this.peso = peso;
        this.cor = cor;
        this.descricao = descricao;
        this.data_Cadastro = data_Cadastro;
        this.status_Adocao = status_Adocao;
        this.historico_Saude = historico_Saude;
        this.vacinado = vacinado;
        this.castrado = castrado;
    }
}