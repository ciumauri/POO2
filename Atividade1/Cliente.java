import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    private ArrayList<Orcamento> orcamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Orcamento> getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(ArrayList<Orcamento> orcamento) {
        this.orcamento = orcamento;
    }
}
