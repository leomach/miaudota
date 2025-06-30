package miaudota;
import java.util.Date;

public abstract class Usuario {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    protected Date dataCadastro;

    public Usuario(String nome, String cpf, Endereco endereco, Date dataCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public abstract void cadastrar();
    public abstract void atualizarInformacoes();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               "\nCPF: " + cpf +
               "\nEndereço: " + endereco +
               "\nData de Cadastro: " + dataCadastro;
    }
}
