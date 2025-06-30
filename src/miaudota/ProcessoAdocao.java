package miaudota;
import java.util.Date;

public class ProcessoAdocao {
    private int idProcesso;
    private int idPet;
    private int idAdotante;
    private int idTutor;
    private Date dataSolicitacao;
    private String status;
    private Date dataAprovacao;
    private Date dataConclusao;
    private String comentarios;

    public ProcessoAdocao(int idProcesso, int idPet, int idAdotante, int idTutor, Date dataSolicitacao, String status, Date dataAprovacao, Date dataConclusao, String comentarios) {
        this.idProcesso = idProcesso;
        this.idPet = idPet;
        this.idAdotante = idAdotante;
        this.idTutor = idTutor;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
        this.dataAprovacao = dataAprovacao;
        this.dataConclusao = dataConclusao;
        this.comentarios = comentarios;
    }

    public void iniciarProcesso() {
        this.status = "Pendente";
        this.dataSolicitacao = new Date();
        System.out.println("Processo de adoção iniciado. Status: " + this.status);
    }

    public void aprovarOuReprovarAdocao(boolean aprovado) {
        if (aprovado) {
            this.status = "Aprovado";
            this.dataAprovacao = new Date();
            System.out.println("Adoção aprovada em: " + this.dataAprovacao);
        }else{
            this.status = "Reprovado";
            this.dataAprovacao = new Date();
            System.out.println("adoção reprovada em: " + this.dataAprovacao);
        }
    }

    public void finalizarProcesso() {
        if (!this.status.equals("Aprovado")) {
            System.out.println("ERRO: Apenas processos aprovados podem ser finalizados.");
            return;
        }
        this.status = "Concluído";
        this.dataConclusao = new Date();
        System.out.println("Processo de adoção concluído em: " + this.dataConclusao);
    }

    public void registrarFeedback(String feedback) {
        this.comentarios = feedback;
        System.out.println("Feedback registrado: " + this.comentarios);
    }

    public void exibirDetalhes() {
        System.out.println("ID Processo: " + idProcesso);
        System.out.println("ID Pet: " + idPet);
        System.out.println("ID Adotante: " + idAdotante);
        System.out.println("ID Tutor: " + idTutor);
        System.out.println("Data de Solicitação: " + dataSolicitacao);
        System.out.println("Status: " + status);
        System.out.println("Data da Aprovação: " + dataAprovacao);
        System.out.println("Data da Conclusão: " + dataConclusao);
        System.out.println("Comentários: " + comentarios);
    }

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public int getIdAdotante() {
        return idAdotante;
    }

    public void setIdAdotante(int idAdotante) {
        this.idAdotante = idAdotante;
    }

    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataAprovacao() {
        return dataAprovacao;
    }

    public void setDataAprovacao(Date dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
