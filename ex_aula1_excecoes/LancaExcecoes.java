import java.io.*;

public class LancaExcecoes{
    public static void main(String[] args) throws Exception{
        LancaExcecoes le = new LancaExcecoes();
        le.lerArquivos();
    }

    public void lerArquivos() throws Exception{
        String arqEntrada = "arquivo.txt";
        BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
        String linha;
        while((linha = arq.readLine()) != null){
            System.out.println(linha + "\n");
        }
        arq.close();
    }
}