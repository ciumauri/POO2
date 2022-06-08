import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAeroporto {
    HashMap<String, ArrayList<String>> aniversariantes;

    public static void main(String[] args) {
        HashMapAeroporto hashAero = new HashMapAeroporto();
        hashAero.aniversariantes = new HashMap<String, ArrayList<String>>();

        hashAero.adicionarAniver("05/06", "Raimundo");
        hashAero.adicionarAniver("11/08", "Ana Sophia");
        hashAero.adicionarAniver("02/05", "José Miguel");
        hashAero.adicionarAniver("05/06", "Luciene");
        hashAero.adicionarAniver("10/08", "Erika");
        hashAero.adicionarAniver("27/09", "Mauricio");
        hashAero.listarDatas();
        hashAero.consultarAniver("27/09");
    }

    public void adicionarAniver(String data, String nome) {
        if(this.aniversariantes.get(data) == null) {
            this.aniversariantes.put(data, new ArrayList<String>());
        }
        this.aniversariantes.get(data).add(nome);        
    }

    public void listarDatas() {
        System.out.println("Datas com Aniversariantes");
        for(String item : this.aniversariantes.keySet()){
            System.out.println(item);
        }
    }

    public void consultarAniver(String data) {
        if(this.aniversariantes.containsKey(data)){
            System.out.println("Aniversariantes do dia " + data);
            ArrayList<String> arrayListNomes = this.aniversariantes.get(data);
            for(String nome : arrayListNomes){
                System.out.println(nome);
            }
        }
        
    }

}
