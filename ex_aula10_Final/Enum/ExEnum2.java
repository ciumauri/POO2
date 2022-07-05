enum Nivel {
    BAIXO, MEDIO, ALTO
}

public class ExEnum2 {
    public static void main(String[] args) {
        Nivel nivelAtual = Nivel.MEDIO;

        switch (nivelAtual) {
            case BAIXO:
                System.out.println("Nível baixo");
                break;
            case MEDIO:
                System.out.println("Nível médio");
                break;
            case ALTO:
                System.out.println("Nível alto");
                break;
        }

        // percorrer todos os valores da enum
        System.out.println("\nPercorrendo todos os valores da enum");
        for (Nivel nivel : Nivel.values()) {
            System.out.println(nivel);
        }
    }

}
