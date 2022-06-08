import java.util.HashMap;

public class Dias {
    public static void main(String[] args) {
        HashMap<String, String> diasSemana = new HashMap<String, String>();

        diasSemana.put("SEG", "Segunda-Feira");
        diasSemana.put("TER", "Terça-Feira");
        diasSemana.put("QUA", "Quarta-Feira");
        diasSemana.put("QUI", "Quinta-Feira");
        diasSemana.put("SEX", "Sexta-Feira");
        diasSemana.put("SAB", "Sábado");
        diasSemana.put("DOM", "Domingo");

        System.out.println("Mostrar: " + diasSemana);

        System.out.println("Verificando se um item existe:");
        System.out.println("QUA existe?" +diasSemana.containsKey("QUA"));
        System.out.println("XYZ existe?" +diasSemana.containsKey("XYZ"));

        System.out.println("Pesquisando um item:");
        System.out.println(diasSemana.get("TER"));

        System.out.println("A quantidade de pares é:" + diasSemana.size());

        System.out.println("Removendo um item:");
        System.out.println(diasSemana.remove("TER"));
        System.out.println("A quantidade de pares é:" + diasSemana.size());

        System.out.println("Percorrendo um conjunto de chaves:");
        for(String chave : diasSemana.keySet()){
            System.out.println(chave);
        }

        System.out.println("Percorrendo um conjunto de valores:");
        for(String value : diasSemana.values()){
            System.out.println(value);
               }



       }
}
