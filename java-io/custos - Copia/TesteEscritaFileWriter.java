import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
    public static void main(String[] args) throws IOException {

        // Fluxo de Saída de Arquivos
        BufferedWriter bw = new BufferedWriter(new FileWriter("custo_novo.txt"));

        bw.write("codigo;estoque;nome;preco_custo;categoria");
        bw.newLine();
        bw.write("001;45;Papel A4;9,9;papelaria");

        bw.close();
    }
}