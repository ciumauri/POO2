import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {
    public static void main(String[] args) throws IOException {

        // Fluxo de Saída de Arquivos
        PrintStream ps = new PrintStream("lorem.txt");

        ps.println("codigo;estoque;nome;preco_custo;categoria");
        ps.println("001;45;Papel A4;9,9;papelaria");

        ps.close();
    }
}