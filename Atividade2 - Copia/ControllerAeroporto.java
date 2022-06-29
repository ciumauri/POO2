import java.util.ArrayList;
import java.util.HashMap;

public class ControllerAeroporto {

    ProgramaAeroporto hashAero = new ProgramaAeroporto();
    HashMap<String, ArrayList<String>> aeroportos;
    

    public void adicionarAeroporto(String nome, String cidade, String altitude) {
        if(this.aeroportos.get(nome) == null) {
            this.aeroportos.put(nome, new ArrayList<String>());
        }
        this.aeroportos.get(nome).add(cidade);        
        this.aeroportos.get(nome).add(altitude);        
    }

    public void listarAeroportos() {
        System.out.println("Aeroportos:");
        for(String item : this.aeroportos.keySet()){
            System.out.println(item);
        }
    }

    public void removerAeroporto(String nome) {
        System.out.println("Removeu : " + nome);
       this.aeroportos.remove(nome);
    }

    public void consultarAeroporto(String nome) {
        if(this.aeroportos.containsKey(nome)){
            System.out.println("Sigla do Aeroporto: " + nome);
            ArrayList<String> arrayListDetalhes = this.aeroportos.get(nome);
            for(String informacoes : arrayListDetalhes){
                System.out.println("Informações: " + informacoes);
            }
        }
        
    }   
    
}
