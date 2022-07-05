public class ExEstatico {
    private String nome;
    private static int x;
    private int y;

    public static void main(String[] args) {
        x = 5;
        // y=10;
        ExEstatico ex1 = new ExEstatico();
        ex1.y = 8;
        ex1.nome = "João";
        ex1.testar();

        ExEstatico ex2 = new ExEstatico();
        ex2.y = 9;
        ex2.nome = "Maria";
        ex2.testar();
        ex1.testar();

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        System.out.println("Qtde de Clientes = " + Cliente.qtdeClientes);
    }

    private void testar() {
        System.out.println("x vale " + this.x);
        System.out.println("y vale " + this.y);
        System.out.println("nome vale " + this.nome);
    }

}
