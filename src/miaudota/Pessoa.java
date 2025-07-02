package miaudota;

public abstract class Pessoa {
    protected int idPessoa;
    protected boolean statusConta;
    protected String historicoAdocao;

    public Pessoa(int idPessoa, boolean statusConta) {
        this.idPessoa = idPessoa;
        this.statusConta = statusConta;
    }

    public abstract void cadastrar();
    public abstract void atualizarInformacoes();


    public String listarAnimais() {
        String[] animais = new String[]{"Cachorro", "Gato", "Papagaio", "Macaco", "Peixe", "Cavalo", "Bode", "Cabra", "Vaca", "Boi"};

        if (animais.length == 0) {
            return "Nenhum animal registrado sob a responsabilidade do usuário.";
        }

        StringBuilder lista = new StringBuilder("Animais sob responsabilidade do usuário:\n");
        for (String animal : animais) {
            lista.append("- ").append(animal).append("\n");
        }

        return lista.toString();
    }

    public String visualizarHistórico() {
        if (historicoAdocao == null || historicoAdocao.isEmpty()) {
            return "Nenhum histórico de adoção disponível.";
        }

        return "Histórico de Adoção:\n" + historicoAdocao;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}
