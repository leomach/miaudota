package miaudota;
import java.util.Date;

public class Usuario extends Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Date dataCadastro;

    public Usuario(String nome, String cpf, Endereco endereco, Date dataCadastro, int idPessoa, boolean statusConta) {
        super(idPessoa, statusConta);
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    @Override
    public void cadastrar(){
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO:  O nome do Pessoa não pode estar vazio.");
            return;
        }
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("ERRO:  O CPF do Pessoa não pode estar vazio.");
            return;
        }

        System.out.println("Cadastrando Pessoa no sistema....");
        System.out.println("ID: " + idPessoa);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Status da Conta: " + (statusConta ? "Ativa" : "Inativa"));

        System.out.println("Pessoa cadastrado com sucesso!");
    }

    @Override
    public void atualizarInformacoes() {
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO: O nome do Pessoa não pode estar vazio.");
            return;
        }

        System.out.println("Atualizando informações do Pessoa");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + endereco.getTelefone());
        System.out.println("Email: " + endereco.getEmail());
        System.out.println("Endereço: " + endereco);
        System.out.println("Status da conta: " + (statusConta ? "Ativa" : "Inativa"));

        System.out.println("Informações de Pessoa atualizada com sucesso!");
    }

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
