import java.util.ArrayList;
import java.util.Scanner;

public class ClassePrincipal {
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Orcamento> orcamentos = new ArrayList<>();
    Cliente cliente = new Cliente();
    Orcamento orcamento = new Orcamento();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ClassePrincipal classePrincipal = new ClassePrincipal();
        classePrincipal.menu();
    }

    public void menu() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n---------------------------------------");
            System.out.println("GERENCIADOR DE ORÇAMENTOS");
            System.out.println("[1] Cadastrar Cliente");
            System.out.println("[2] Listar Clientes");
            System.out.println("[3] Cadastrar Orçamento");
            System.out.println("[4] Consultar Orçamento");
            System.out.println("\n---------------------------------------");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Erro... Informe um numero inteiro" + e.getMessage());
            }

            if (opcao == 1) {
                this.cadastrarCliente();
            } else if (opcao == 2) {
                this.listarClientes();
            } else if (opcao == 3) {
                this.cadastrarOrcamento();
            } else if (opcao == 4) {
                this.consultarOrcamento();
            }
        }
    }

    public void cadastrarCliente() {
        System.out.println("\n---------------------------------------");
        System.out.println("CADASTRO DE CLIENTE");
        System.out.println("Informe o código do cliente: ");
        cliente.setCodigo(Integer.parseInt(sc.nextLine()));
        ;
        System.out.println("Informe o nome do cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Informe o telefone do cliente: ");
        cliente.setTelefone(sc.nextLine());
        System.out.println("Informe o cpf do cliente: ");
        cliente.setCpf(sc.nextLine());
        clientes.add(cliente);
        System.out.println("\n---------------------------------------");
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("\n---------------------------------------");
    }

    public void listarClientes() {
        System.out.println("\n---------------------------------------");
        System.out.println("[Listagem de Clientes]");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getCodigo() + " - " + cliente.getNome() + " - " + cliente.getTelefone() + " - "
                    + cliente.getCpf());
        }
        System.out.println("\n---------------------------------------");
    }

    public void cadastrarOrcamento() {
        System.out.println("\n---------------------------------------");
        System.out.println("CADASTRO DE ORÇAMENTO");
        System.out.println("Informe o CPF do cliente: ");
        cliente.setCpf(sc.nextLine());
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cliente.getCpf())) {
                System.out.println("Informe o código do orçamento: ");
                orcamento.setCodigo(Integer.parseInt(sc.nextLine()));
                System.out.println("Informe a descrição do orçamento: ");
                orcamento.setDescricao(sc.nextLine());
                System.out.println("Informe a data do orçamento: ");
                orcamento.setData(sc.nextLine());
                System.out.println("Informe o valor do orçamento: ");
                orcamento.setValor(Double.parseDouble(sc.nextLine()));
                orcamentos.add(orcamento);
                System.out.println("\n---------------------------------------");
                System.out.println("Orçamento cadastrado com sucesso!");
                System.out.println("\n---------------------------------------");
            } else {
                System.out.println("Cliente não encontrado!");
            }
        }
    }

    public void consultarOrcamento() {
        System.out.println("\n---------------------------------------");
        System.out.println("CONSULTA DE ORÇAMENTO");
        System.out.println("Informe o código do orçamento: ");
        orcamento.setCodigo(Integer.parseInt(sc.nextLine()));
        for (Orcamento orcamento : orcamentos) {
            if (orcamento.getCodigo() == orcamento.getCodigo()) {
                System.out.println("Código: " + orcamento.getCodigo());
                System.out.println("Descrição: " + orcamento.getDescricao());
                System.out.println("Data: " + orcamento.getData());
                System.out.println("Valor: " + orcamento.getValor());
            } else {
                System.out.println("Orçamento não encontrado!");
            }
        }
        System.out.println("\n---------------------------------------");
    }
}