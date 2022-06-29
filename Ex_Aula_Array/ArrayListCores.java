import java.util.ArrayList;

public class ArrayListCores {
    public static void main(String[] args) {
        String[] vetCores = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
        ArrayList<String> listaCores = new ArrayList<String>();

        System.out.println("Vetor: ");
        for (String cor : vetCores) {// para cada com no vetor de cores
            System.out.println(cor);
            listaCores.add(cor);
        }

        System.out.println("ArrayList:");
        // percorrendo com contador
        for (int count = 0; count < listaCores.size(); count++) {
            System.out.println(listaCores.get(count));
        }

        System.out.println("ArrayList");
        for(String cor: listaCores){
            System.out.println(cor);
        }

    }
}
