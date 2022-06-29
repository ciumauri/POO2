import java.util.ArrayList;
import java.util.Iterator;

public class CadCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> list = new ArrayList<Cliente>();

        Cliente c1 = new Cliente();
        c1.setNome("Mauricio");
        c1.setEmail("mngoliveira@gmail.com");
        c1.setFone("45999776318");
        c1.setCpf("8996665554");
        //add eleento na lista
        list.add(c1);

        Cliente c2 = new Cliente();
        c2.setNome("Sophia");
        c2.setEmail("sophia@gmail.com");
        c2.setFone("8766985474");
        c2.setCpf("465465456465");
        //add eleento na lista
        list.add(c2);

        Cliente c3 = new Cliente();
        c3.setNome("Matheus");
        c3.setEmail("matheus@gmail.com");
        c3.setFone("719558455686");
        c3.setCpf("9958758556");
        //add eleento na lista
        list.add(c3);

        System.out.println("Percorrendo a Lista");
        Iterator<Cliente>  it = list.iterator();
        //pegar o proximo elemento da lista
        Cliente cli = it.next();
        System.out.println("Cliente: " + cli.getNome() 
                    + " CPF: " + cli.getCpf());

        Cliente cRemover = new Cliente();
        cRemover.setNome("Matheus");
        cRemover.setEmail("matheus@gmail.com");
        cRemover.setFone("719558455686");
        cRemover.setCpf("9958758556");
        if(list.contains(cRemover)){
            //comparar o objeto inteiro nao funciona
            System.out.println("Encontrou?!");
        }

        Cliente cRemover2 = new Cliente();
        cRemover2.setCpf("465465456465"); 
        //removendo da Lista
        Iterator<Cliente> itFemover = list.iterator();
        while(itFemover.hasNext()){
            if(itFemover.next().getCpf().equals(cRemover2.getCpf())){
                System.out.println("Removendo cliente");
                itFemover.remove();
            }
        }
       }
}
