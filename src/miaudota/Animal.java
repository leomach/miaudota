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

    public Animal(int id, String nome, String raca, int idade, String sexo, String porte, double peso, String cor,
                String descricao, Date dataCadastro, boolean vacinado, boolean castrado) {
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

    public abstract String getTipo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean getVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public boolean getCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
}
