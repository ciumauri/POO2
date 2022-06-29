import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada de Arquivos
        InputStream fis = new FileInputStream("custo.csv");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        // Fluxo de Saída de Arquivos
        OutputStream fos = new FileOutputStream("venda.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while (linha != null) {
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}
