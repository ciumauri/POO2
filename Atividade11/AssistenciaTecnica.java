import java.io.*;
import java.util.ArrayList;

public class AssistenciaTecnica {
	private BufferedReader reader;
    public static void main(String[] args) throws Exception {
        AssistenciaTecnica at = new AssistenciaTecnica();
        at.menu();
        ArrayList<Cliente> lista = new ArrayList<Cliente>();        
    }

    public void menu() throws Exception{
		String opcao = "";
		while(!opcao.equals("5")){
			System.out.println("\n-------------------------");
			System.out.println("[1] Cadastrar Cliente");
			System.out.println("[2] Listar Clientes");
			System.out.println("[3] Cadastrar Orçamento:");
			System.out.println("[4] Listar Orçamentos:");
			System.out.println("[5] Sair");
			opcao = this.reader.readLine();
			
			if(opcao.equals("1")){
				this.cadastrarCliente();
			}else if(opcao.equals("2")){
				this.listarClientes();
			}else if(opcao.equals("3")){
				this.cadastrarOrcamento();
			}else if(opcao.equals("4")){
				this.listarOrcamentos();
			}else if(opcao.equals("5")){
				System.out.println("Encerrando...");
			}else {
				System.out.println("Opcao invalida...");
			}
		}
	}

	public void cadastrarCliente() {
		
	}

	public void listarClientes() {
		
	}

	public void cadastrarOrcamento() {
		
	}

	public void listarOrcamentos() {
		
	}
}
