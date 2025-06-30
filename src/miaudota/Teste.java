package miaudota;
import java.util.Date;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays simples para armazenar até 10 tutores, adotantes e processos
        Tutor[] tutores = new Tutor[10];
        int qtdTutores = 0;
        Adotante[] adotantes = new Adotante[10];
        int qtdAdotantes = 0;
        ProcessoAdocao[] processos = new ProcessoAdocao[10];
        int qtdProcessos = 0;

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- Menu MiauDota ---");
            System.out.println("1. Cadastrar Tutor");
            System.out.println("2. Atualizar informações do Tutor");
            System.out.println("3. Listar animais do Tutor");
            System.out.println("4. Cadastrar Adotante");
            System.out.println("5. Atualizar informações do Adotante");
            System.out.println("6. Visualizar histórico do Adotante");
            System.out.println("7. Iniciar processo de adoção");
            System.out.println("8. Aprovar/Reprovar adoção");
            System.out.println("9. Finalizar processo de adoção");
            System.out.println("10. Registrar feedback");
            System.out.println("11. Exibir detalhes do processo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (qtdTutores < tutores.length) {
                        System.out.print("Nome do Tutor: ");
                        String nome = sc.nextLine();
                        System.out.print("CPF: ");
                        String cpf = sc.nextLine();
                        System.out.print("Rua: ");
                        String rua = sc.nextLine();
                        System.out.print("Número: ");
                        int numero = sc.nextInt(); sc.nextLine();
                        System.out.print("Bairro: ");
                        String bairro = sc.nextLine();
                        System.out.print("Cidade: ");
                        String cidade = sc.nextLine();
                        System.out.print("CEP: ");
                        String cep = sc.nextLine();
                        System.out.print("Estado: ");
                        String estado = sc.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("ID do Tutor: ");
                        int idTutor = sc.nextInt(); sc.nextLine();
                        System.out.print("Status da Conta (true=Ativa/false=Inativa): ");
                        boolean statusConta = sc.nextBoolean(); sc.nextLine();

                        Endereco end = new Endereco(rua, numero, bairro, cidade, cep, estado, telefone, email);
                        Tutor t = new Tutor(nome, cpf, end, new Date(), idTutor, statusConta);
                        tutores[qtdTutores++] = t;
                        System.out.println("Tutor cadastrado!");
                    } else {
                        System.out.println("Limite de tutores atingido.");
                    }
                    break;
                case 2:
                    if (qtdTutores == 0) {
                        System.out.println("Nenhum tutor cadastrado.");
                        break;
                    }
                    System.out.print("Digite o ID do Tutor para atualizar: ");
                    int idAtualizar = sc.nextInt(); sc.nextLine();
                    Tutor tutorAtualizar = null;
                    for (int i = 0; i < qtdTutores; i++) {
                        if (tutores[i].getIdTutor() == idAtualizar) {
                            tutorAtualizar = tutores[i];
                            break;
                        }
                    }
                    if (tutorAtualizar != null) {
                        System.out.print("Novo nome: ");
                        tutorAtualizar.setNome(sc.nextLine());
                        System.out.print("Novo CPF: ");
                        tutorAtualizar.setCpf(sc.nextLine());
                        tutorAtualizar.atualizarInformacoes();
                    } else {
                        System.out.println("Tutor não encontrado.");
                    }
                    break;
                case 3:
                    if (qtdTutores == 0) {
                        System.out.println("Nenhum tutor cadastrado.");
                        break;
                    }
                    System.out.print("Digite o ID do Tutor para listar animais: ");
                    int idListar = sc.nextInt(); sc.nextLine();
                    Tutor tutorListar = null;
                    for (int i = 0; i < qtdTutores; i++) {
                        if (tutores[i].getIdTutor() == idListar) {
                            tutorListar = tutores[i];
                            break;
                        }
                    }
                    if (tutorListar != null) {
                        System.out.println(tutorListar.listarAnimais());
                    } else {
                        System.out.println("Tutor não encontrado.");
                    }
                    break;
                case 4:
                    if (qtdAdotantes < adotantes.length) {
                        System.out.print("Nome do Adotante: ");
                        String nomeA = sc.nextLine();
                        System.out.print("CPF: ");
                        String cpfA = sc.nextLine();
                        System.out.print("Rua: ");
                        String ruaA = sc.nextLine();
                        System.out.print("Número: ");
                        int numeroA = sc.nextInt(); sc.nextLine();
                        System.out.print("Bairro: ");
                        String bairroA = sc.nextLine();
                        System.out.print("Cidade: ");
                        String cidadeA = sc.nextLine();
                        System.out.print("CEP: ");
                        String cepA = sc.nextLine();
                        System.out.print("Estado: ");
                        String estadoA = sc.nextLine();
                        System.out.print("Telefone: ");
                        String telefoneA = sc.nextLine();
                        System.out.print("Email: ");
                        String emailA = sc.nextLine();
                        System.out.print("ID do Adotante: ");
                        int idAdotante = sc.nextInt(); sc.nextLine();
                        System.out.print("Status da Adoção (true=Aprovado/false=Pendente): ");
                        boolean statusAdocao = sc.nextBoolean(); sc.nextLine();
                        System.out.print("Histórico de adoção: ");
                        String historico = sc.nextLine();

                        Endereco endA = new Endereco(ruaA, numeroA, bairroA, cidadeA, cepA, estadoA, telefoneA, emailA);
                        Adotante a = new Adotante(nomeA, cpfA, endA, new Date(), idAdotante, statusAdocao, historico);
                        adotantes[qtdAdotantes++] = a;
                        System.out.println("Adotante cadastrado!");
                    } else {
                        System.out.println("Limite de adotantes atingido.");
                    }
                    break;
                case 5:
                    if (qtdAdotantes == 0) {
                        System.out.println("Nenhum adotante cadastrado.");
                        break;
                    }
                    System.out.print("Digite o ID do Adotante para atualizar: ");
                    int idAdotAtualizar = sc.nextInt(); sc.nextLine();
                    Adotante adotAtualizar = null;
                    for (int i = 0; i < qtdAdotantes; i++) {
                        if (adotantes[i].getIdAdotante() == idAdotAtualizar) {
                            adotAtualizar = adotantes[i];
                            break;
                        }
                    }
                    if (adotAtualizar != null) {
                        System.out.print("Novo nome: ");
                        adotAtualizar.setNome(sc.nextLine());
                        System.out.print("Novo CPF: ");
                        adotAtualizar.setCpf(sc.nextLine());
                        adotAtualizar.atualizarInformacoes();
                    } else {
                        System.out.println("Adotante não encontrado.");
                    }
                    break;
                case 6:
                    if (qtdAdotantes == 0) {
                        System.out.println("Nenhum adotante cadastrado.");
                        break;
                    }
                    System.out.print("Digite o ID do Adotante para visualizar histórico: ");
                    int idAdotHist = sc.nextInt(); sc.nextLine();
                    Adotante adotHist = null;
                    for (int i = 0; i < qtdAdotantes; i++) {
                        if (adotantes[i].getIdAdotante() == idAdotHist) {
                            adotHist = adotantes[i];
                            break;
                        }
                    }
                    if (adotHist != null) {
                        System.out.println(adotHist.visualizarHistórico());
                    } else {
                        System.out.println("Adotante não encontrado.");
                    }
                    break;
                case 7:
                    if (qtdTutores == 0 || qtdAdotantes == 0) {
                        System.out.println("É necessário pelo menos um tutor e um adotante cadastrados.");
                        break;
                    }
                    if (qtdProcessos < processos.length) {
                        System.out.print("ID do Processo: ");
                        int idProc = sc.nextInt(); sc.nextLine();
                        System.out.print("ID do Pet: ");
                        int idPet = sc.nextInt(); sc.nextLine();
                        System.out.print("ID do Adotante: ");
                        int idAdot = sc.nextInt(); sc.nextLine();
                        System.out.print("ID do Tutor: ");
                        int idTut = sc.nextInt(); sc.nextLine();
                        ProcessoAdocao proc = new ProcessoAdocao(idProc, idPet, idAdot, idTut, new Date(), "pendente", null, null, "");
                        proc.iniciarProcesso();
                        processos[qtdProcessos++] = proc;
                        System.out.println("Processo iniciado!");
                    } else {
                        System.out.println("Limite de processos atingido.");
                    }
                    break;
                case 8:
                    if (qtdProcessos == 0) {
                        System.out.println("Nenhum processo cadastrado.");
                        break;
                    }
                    System.out.print("Digite o ID do Processo para aprovar/reprovar: ");
                    int idProcAprovar = sc.nextInt(); sc.nextLine();
                    ProcessoAdocao procAprovar = null;
                    for (int i = 0; i < qtdProcessos; i++) {
                        if (processos[i].getIdProcesso() == idProcAprovar) {
                            procAprovar = processos[i];
                            break;
                        }
                    }
                    if (procAprovar != null) {
                        System.out.print("Aprovar adoção? (s/n): ");
                        String resp = sc.nextLine();
                        procAprovar.aprovarOuReprovarAdocao(resp.equalsIgnoreCase("s"));
                    } else {
                        System.out.println("Processo não encontrado.");
                    }
                    break;
                case 9:
                    if (qtdProcessos == 0) {
                        System.out.println("Nenhum processo cadastrado.");
                        break;
                    }
                    System.out.print("Digite o ID do Processo para finalizar: ");
                    int idProcFinalizar = sc.nextInt(); sc.nextLine();
                    ProcessoAdocao procFinalizar = null;
                    for (int i = 0; i < qtdProcessos; i++) {
                        if (processos[i].getIdProcesso() == idProcFinalizar) {
                            procFinalizar = processos[i];
                            break;
                        }
                    }
                    if (procFinalizar != null) {
                        procFinalizar.finalizarProcesso();
                    } else {
                        System.out.println("Processo não encontrado.");
                    }
                    break;
                case 10:
                    if (qtdProcessos == 0) {
                        System.out.println("Nenhum processo cadastrado.");
                        break;
                    }
                    System.out.print("Digite o ID do Processo para registrar feedback: ");
                    int idProcFeedback = sc.nextInt(); sc.nextLine();
                    ProcessoAdocao procFeedback = null;
                    for (int i = 0; i < qtdProcessos; i++) {
                        if (processos[i].getIdProcesso() == idProcFeedback) {
                            procFeedback = processos[i];
                            break;
                        }
                    }
                    if (procFeedback != null) {
                        System.out.print("Digite o feedback: ");
                        String fb = sc.nextLine();
                        procFeedback.registrarFeedback(fb);
                    } else {
                        System.out.println("Processo não encontrado.");
                    }
                    break;
                case 11:
                    if (qtdProcessos == 0) {
                        System.out.println("Nenhum processo cadastrado.");
                        break;
                    }
                    System.out.print("Digite o ID do Processo para exibir detalhes: ");
                    int idProcDetalhes = sc.nextInt(); sc.nextLine();
                    ProcessoAdocao procDetalhes = null;
                    for (int i = 0; i < qtdProcessos; i++) {
                        if (processos[i].getIdProcesso() == idProcDetalhes) {
                            procDetalhes = processos[i];
                            break;
                        }
                    }
                    if (procDetalhes != null) {
                        procDetalhes.exibirDetalhes();
                    } else {
                        System.out.println("Processo não encontrado.");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

}
