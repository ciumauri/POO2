import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
        Locadora loc = new Locadora();
        loc.menuPrincipal();
    }

    public void menuPrincipal() {
        int opcao = -1;
        try (Scanner scanner = new Scanner(System.in)) {
            while (opcao != 0) {
                System.out.println("\n---------------------------------------");
                System.out.println("MENU PRINCIPAL");
                System.out.println("[1] Gerenciar Veiculos");
                System.out.println("[2] Gerenciar Clientes");
                System.out.println("[0] Sair");
                System.out.println("\n---------------------------------------");

                try {
                    opcao = Integer.parseInt(scanner.nextLine());
                } catch (Exception e) {
                    System.out.println("Erro... Informe um numero inteiro" + e.getMessage());
                }

                if (opcao == 1) {
                    // gerenciar veiculos
                    GerencadorVeiculo gv = new GerencadorVeiculo();
                    gv.menu();
                } else if (opcao == 2) {
                    // gerenciar clientes
                    GerencadorCliente gc = new GerencadorCliente();
                    gc.menu();
                } else if (opcao == 0) {
                    System.out.println("Ate logo.");
                } else {
                    System.out.println("Opcao invalida.");
                }
            }
        }
    }
}
