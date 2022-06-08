import java.util.HashMap;

public class CadEstados{
    public static void main(String[] args) {
        HashMap<String, Estado> estados = new HashMap<String, Estado>();

        Estado e1 = new Estado();
        e1.setNome("Paraná");
        e1.setRegiao("Sul");
        estados.put("PR", e1);

        Estado e2 = new Estado();
        e2.setNome("São Paulo");
        e2.setRegiao("Sudeste");
        estados.put("SP", e2);

        Estado e3 = new Estado();
        e3.setNome("Bahia");
        e3.setRegiao("Nordeste");
        estados.put("BA", e3);

        System.out.println("Estados armazenados: " + estados);
        System.out.println("Verificando se um estado existe:");
        if(estados.containsKey("SP")){
            System.out.println("SP existe no HashMap");
            System.out.println("Buscando a região do estado de SP:");
            System.out.println(estados.get("SP").getRegiao());
        }

        System.out.println("Percorrendo o conjunto de chaves:");
        for (String chave : estados.keySet()) {
            System.out.println("chave: " + chave);
        }       
        
    }
}