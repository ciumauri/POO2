import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) throws Exception {

        // Fluxo de Entrada de dados
        Scanner scanner = new Scanner(new File("custo.csv"));
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println(linha);

            String[] valores = linha.split(",");
            System.out.println(valores);

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.csv"))) {
                oos.writeObject(linha);
            }

        }
        scanner.close();

    }
}
