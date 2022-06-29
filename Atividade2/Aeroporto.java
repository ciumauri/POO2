public class Aeroporto {

    private String codigo;
    private String nome;
    private String cidade;
    private String altitude;   
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getcidade() {
        return cidade;
    }

    public String getaltitude() {
        return altitude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setcidade(String cidade) {
        this.cidade = cidade;
    }

    public void setaltitude(String altitude) {
        this.altitude = altitude;
    }
    
}