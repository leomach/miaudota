package miaudota;
import java.util.Date;

public class Tutor extends Usuario {
    private int idTutor;
    private boolean statusConta;

    public Tutor(String nome, String cpf, Endereco endereco, Date dataCadastro, int idTutor, boolean statusConta) {
        super(nome, cpf, endereco, dataCadastro);
        this.idTutor = idTutor;
        this.statusConta = statusConta;
    }

    @Override
    public void cadastrar(){
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO:  O nome do Tutor não pode estar vazio.");
            return;
        }
        if (cpf == null || cpf.isEmpty()) {
            System.out.println("ERRO:  O CPF do Tutor não pode estar vazio.");
            return;
        }

        System.out.println("Cadastrando tutor no sistema....");
        System.out.println("ID: " + idTutor);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Status da Conta: " + (statusConta ? "Ativa" : "Inativa"));

        System.out.println("Tutor cadastrado com sucesso!");
    }

    @Override
    public void atualizarInformacoes() {
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO: O nome do Tutor não pode estar vazio.");
            return;
        }

        System.out.println("Atualizando informações do Tutor");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + endereco.getTelefone());
        System.out.println("Email: " + endereco.getEmail());
        System.out.println("Endereço: " + endereco);
        System.out.println("Status da conta: " + (statusConta ? "Ativa" : "Inativa"));

        System.out.println("Informações de Tutor atualizada com sucesso!");
    }

    public String listarAnimais() {
        String[] animais = new String[]{"Cachorro", "Gato", "Papagaio", "Macaco", "Peixe", "Cavalo", "Bode", "Cabra", "Vaca", "Boi"};

        if (animais.length == 0) {
            return "Nenhum animal registrado sob a responsabilidade do Tutor.";
        }

        StringBuilder lista = new StringBuilder("Animais sob responsabilidade do Tutor:\n");
        for (String animal : animais) {
            lista.append("- ").append(animal).append("\n");
        }

        return lista.toString();
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}
