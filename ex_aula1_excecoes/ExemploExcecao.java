public class ExemploExcecao {
    public static void main(String[] args) {
        ExemploExcecao ee = new ExemploExcecao();
        ee.calcular();
        System.out.println("Fim...");
    }

    public void calcular(){
        try{
            float res;
            OperacoesMatematicas opMat = new OperacoesMatematicas();
            res = opMat.dividir(5, 2);
            System.out.println(res);
            res = opMat.dividir(4, 0);
            System.out.println(res);
        }catch (DivisaoPorZeroException e1){
            System.out.println("Descricao do erro:" + e1.getMessage());
        }

    }
}
