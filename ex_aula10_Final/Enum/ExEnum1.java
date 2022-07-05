public class ExEnum1 {
    enum Turno {
        MANHA,
        TARDE,
        NOITE
    }

    public static void main(String[] args) {
        Turno turnoCurso = Turno.TARDE;
        System.out.println(turnoCurso);
    }
}
