import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada de Arquivos
        InputStream fis = new FileInputStream("custo.csv");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}