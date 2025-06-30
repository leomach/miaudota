package miaudota;
import java.util.Date;

public class Adotante extends Usuario {
    private int idAdotante;
    private boolean statusAdocao;
    private String historicoAdocao;

    public Adotante(String nome, String cpf, Endereco endereco, Date dataCadastro, int idAdotante, boolean statusAdocao, String historicoAdocao) {
        super(nome, cpf, endereco, dataCadastro);
        this.idAdotante = idAdotante;
        this.statusAdocao = statusAdocao;
        this.historicoAdocao = historicoAdocao;
    }

    @Override
    public void cadastrar() {
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO: O nome do Adotante não pode estar vazio.");
            return;
        }

        if (cpf == null || cpf.isEmpty()) {
            System.out.println("ERRO: O CPF do Adotante não pode estar vazio.");
            return;
        }

        System.out.println("Cadastrando Adotante no sistema....");
        System.out.println("ID: " + idAdotante);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Status adoção: " + (statusAdocao ? "Aprovado" : "Pendente"));
        System.out.println("Histórico de adoção" + historicoAdocao);

        System.out.println("Adotante cadastrado com sucesso!");
    }

    @Override
    public void atualizarInformacoes() {
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO: nome do adotante não pode estar vazio.");
            return;
        }

        System.out.println("Atualizando informações do Adotante....");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + endereco.getTelefone());
        System.out.println("Email: " + endereco.getEmail());
        System.out.println("Endereço: " + endereco);
        System.out.println("Status Adoção: " + (statusAdocao ? "Aprovado" : "Pendente"));

        System.out.println("Informações do Adotante atualizadas com sucesso!");
    }

    public String visualizarHistórico() {
        if (historicoAdocao == null || historicoAdocao.isEmpty()) {
            return "Nenhum histórico de adoção disponível.";
        }

        return "Histórico de Adoção:\n" + historicoAdocao;
    }

    public int getIdAdotante() {
        return idAdotante;
    }

    public void setIdAdotante(int idAdotante) {
        this.idAdotante = idAdotante;
    }

    public boolean getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(boolean statusAdocao) {
        this.statusAdocao = statusAdocao;
    }

    public String getHistoricoAdocao() {
        return historicoAdocao;
    }

    public void setHistoricoAdocao(String historicoAdocao) {
        this.historicoAdocao = historicoAdocao;
    }
}
