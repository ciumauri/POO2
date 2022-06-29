import java.util.ArrayList;
import java.util.Scanner;

public class GerencadorCliente {
    Scanner scanner;
    DaoCliente daoCliente;

    public GerencadorCliente() {
        scanner = new Scanner(System.in);
        daoCliente = new DaoCliente();
    }

    public void menu() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n---------------------------------------------------------");
            System.out.println("GERENCIADOR DE CLIENTES");
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Exibir");
            System.out.println("[3] Atualizar");
            System.out.println("[4] Excluir");
            System.out.println("[5] Listar Todos");
            System.out.println("[0] Voltar ao menu anterior");
            System.out.println("\n---------------------------------------------------------");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Erro... Informe um numero inteiro" + e.getMessage());
            }

            if (opcao == 1) {
                this.cadastrar();
            } else if (opcao == 2) {
                this.atualizar();
            } else if (opcao == 4) {
                this.excluir();
            } else if (opcao == 5) {
                this.listarTodos();
            }
        }
    }

    public void cadastrar() {
        Cliente cliente = new Cliente();

        System.out.println("\n---------------------------------------------------------");
        System.out.println("[Cadastro de Clientes]");
        System.out.println("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.println("Email: ");
        cliente.setEmail(scanner.nextLine());
        System.out.println("Telefone: ");
        cliente.setFone(scanner.nextLine());
        System.out.println("CPF: ");
        cliente.setCpf(scanner.nextLine());

        boolean inserido = daoCliente.inserir(cliente);// passa o objeto
        if (inserido) {
            System.out.println("Inserido com sucesso.");
        }
    }

    public void atualizar() {
        Cliente cliente = new Cliente();

        System.out.println("\n---------------------------------------------------------");
        System.out.println("[Cadastro de Clientes]");
        System.out.println("Marca: ");
        cliente.setNome(scanner.nextLine());
        System.out.println("Modelo: ");
        cliente.setEmail(scanner.nextLine());
        System.out.println("Chassi: ");
        cliente.setFone(scanner.nextLine());
        System.out.println("Ano: ");
        cliente.setCpf(scanner.nextLine());
        ;

        boolean inserido = daoCliente.editar(cliente);// passa o objeto
        if (inserido) {
            System.out.println("Inserido com sucesso.");
        }
    }

    public void excluir() {
        System.out.println("----------------------------------");
        System.out.println("[Exclusao de Clientes:]");
        System.out.println("Codigo: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        int qtde = daoCliente.excluir(codigo);
        if (qtde > 0) {
            System.out.println("Excluido com sucesso");
        } else {
            System.out.println("Não encontrado");
        }

    }

    private void listarTodos() {
        ArrayList<Cliente> resultado = daoCliente.buscarTodos();
        System.out.println("----------------------------------");
        System.out.println("[Clientes cadastrados:]");
        for (Cliente c : resultado) {
            System.out.println("Nome: " + c.getNome()
                    + ", Email: " + c.getEmail()
                    + ", Telefone: " + c.getFone()
                    + ", CPF: " + c.getCpf()
                    + ", Codigo " + c.getCodigo());
        }

    }
}
