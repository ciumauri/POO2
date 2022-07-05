import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        // Fluxo de Saída de Arquivos
        OutputStream fos = new FileOutputStream("custo2.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("codigo;estoque;nome;preco_custo;categoria");
        bw.newLine();
        bw.write("001;45;Papel A4;9,9;papelaria");

        bw.close();
    }
}