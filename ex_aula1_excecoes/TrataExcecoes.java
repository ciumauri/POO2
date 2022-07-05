import java.io.*;

public class TrataExcecoes {

	public static void main(String[] args){
		TrataExcecoes tr1 = new TrataExcecoes();
		tr1.lerArquivos();
	}

    public void lerArquivos() {
        try{
            String arqEntrada = "arquivo.txt";
            BufferedReader arq = new BufferedReader(new FileReader(arqEntrada));
            String linha;
            while((linha = arq.readLine()) != null){
                System.out.println(linha + "\n");
            }
            arq.close();
        }catch(FileNotFoundException e1){//captura excecoes do tipo FileNotFound
            System.out.println("Arquivo nao encontrado!");
        }catch(Exception e2){//captura excecoes genericas
            System.out.println("Erro inesperado");
        }finally{//executado sempre
            System.out.println("Encerrando...");
        }
    }    
}

