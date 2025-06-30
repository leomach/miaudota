package miaudota;
public class Endereco {
    private String rua;
    private int numero_casa;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private String telefone;
    private String email;

    public Endereco (String rua, int numero_casa, String bairro, String cidade, String cep, String estado, String telefone, String email) {
        this.rua = rua;
        this.numero_casa = numero_casa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroCasa() {
        return numero_casa;
    }

    public void setNumeroCasa(int numero_casa) {
        this.numero_casa = numero_casa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return rua + ", " + numero_casa + " - " + bairro + 
               "\n" + cidade + " - " + estado + 
               "\nCEP: " + cep;
    }
}
