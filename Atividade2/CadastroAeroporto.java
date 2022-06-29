import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CadastroAeroporto {
    HashMap<String, ArrayList<String>> aeroportos;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CadastroAeroporto hashAeroporto = new CadastroAeroporto();
        hashAeroporto.aeroportos = new HashMap<String, ArrayList<String>>();
        hashAeroporto.menu();
    }

    public void menu() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n---------------------------------------------------------");
            System.out.println("GERENCIADOR DE AEROPORTOS");
            System.out.println("[1] Cadastrar Aeroporto");
            System.out.println("[2] Listar Aeroportos");
            System.out.println("[3] Excluir Aeroporto ");
            System.out.println("[4] Consultar Informações do Aeroporto");
            System.out.println("\n---------------------------------------------------------");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Erro... Informe um numero inteiro" + e.getMessage());
            }

            if (opcao == 1) {
                this.cadastrarAeroporto();
            } else if (opcao == 2) {
                this.listarAeroportos();
            } else if (opcao == 3) {
                this.excluirAeroporto();
            } else if (opcao == 4) {
                this.cosultarInformacoes();
            }
        }
    }

    public void cadastrarAeroporto() {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("[Cadastro de Aeroportos]");
        System.out.println("Informe o código do Aeroporto: ");
        String codigo = scanner.nextLine();
        System.out.println("Informe o nome do Aeroporto:: ");
        String nome = scanner.nextLine();
        System.out.println("Informe a cidade do Aeroporto:: ");
        String cidade = scanner.nextLine();
        System.out.println("Informe a altitude do Aeroporto:: ");
        String altitude = scanner.nextLine();
        System.out.println("\n---------------------------------------------------------");

        if (aeroportos.containsKey(codigo)) {
            System.out.println("Aeroporto já cadastrado");
        } else {
            ArrayList<String> lista = new ArrayList<String>();
            lista.add(nome);
            lista.add(cidade);
            lista.add(altitude);
            aeroportos.put(codigo, lista);
            System.out.println("Aeroporto cadastrado com sucesso");
        }
    }

    public void listarAeroportos() {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("[Listagem de Aeroportos]");
        for (String key : aeroportos.keySet()) {
            System.out.println("Código: " + key);
            System.out.println("Nome: " + aeroportos.get(key).get(0));            
        }
        System.out.println("\n---------------------------------------------------------");
    }

    public void cosultarInformacoes() {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("[Informações do Aeroporto]");
        System.out.println("Informe o código do Aeroporto: ");
        String codigo = scanner.nextLine();
        if (aeroportos.containsKey(codigo)) {
            ArrayList<String> arrayListInformacoes = this.aeroportos.get(codigo);
            for (String nome : arrayListInformacoes) {
                System.out.println(nome);
            }
        } else {
            System.out.println("Aeroporto não cadastrado");
        }
        System.out.println("\n---------------------------------------------------------");
    }

    public void excluirAeroporto() {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("[Excluir Aeroporto]");
        System.out.println("Informe o código do Aeroporto: ");
        String codigo = scanner.nextLine();
        if (aeroportos.containsKey(codigo)) {
            aeroportos.remove(codigo);
            System.out.println("Aeroporto excluído com sucesso");
        } else {
            System.out.println("Aeroporto não cadastrado");
        }
        System.out.println("\n---------------------------------------------------------");
    }   
    
}
