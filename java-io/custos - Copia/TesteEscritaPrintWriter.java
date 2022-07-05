import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {
    public static void main(String[] args) throws IOException {

        // Fluxo de Saída de Arquivos
        PrintWriter pw = new PrintWriter("lorem1.txt");

        pw.println("codigo;estoque;nome;preco_custo;categoria");
        pw.println("001;45;Papel A4;9,9;papelaria");

        pw.close();
    }
}
