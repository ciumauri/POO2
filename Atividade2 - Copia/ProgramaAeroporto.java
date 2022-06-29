import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProgramaAeroporto {
    HashMap<String, ArrayList<String>> aeroportos;

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        Scanner dados1 = new Scanner(System.in);
        Scanner dados2 = new Scanner(System.in);
        Scanner dados3 = new Scanner(System.in);
        ProgramaAeroporto hashAero = new ProgramaAeroporto();
        hashAero.aeroportos = new HashMap<String, ArrayList<String>>();
        CadastroAeroporto aero = new CadastroAeroporto();

        String nome = "";
        String cidade = "";
        String altitude = "";

        System.out.println(
            "Opções\n 1-Cadastrar Aeroporto\n 2-Listar Aeroportoss\n 3-Remover Aeroporto\n 4-Consultar Aeroporto\n");
    int numopc = 0;

    System.out.print(
            "nº: ");

    numopc = dados.nextInt();

        while (numopc
                == 1) {

            switch (numopc) {

                case 1:
                    System.out.println("Sigla do Aeroporto: ");
                    nome = dados1.nextLine();
                    aero.setNome(nome);

                    System.out.println("Cidade do Aeroporto: ");
                    cidade = dados2.nextLine();
                    aero.setcidade(cidade);

                    System.out.println("Altitude do Aeroporto: ");
                    altitude = dados3.nextLine();
                    aero.setaltitude(altitude);                

                    System.out.println("\n Cadastrar outro Aeroporto?\n  1-Sim\n  0-Não\n");
                    numopc = dados.nextInt();                    
                    
                    aero = new CadastroAeroporto();
                    break;

                case 2:
                    break;
            }

        }
    }

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
