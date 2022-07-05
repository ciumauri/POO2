package ExEnum3;

public class Cadastro {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(20);
        pessoa1.setEmail("mngoliveira@live.com");
        pessoa1.setEstadoCivil(EstadoCivil.SOLTEIRO);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("Estado Civil: " + pessoa1.getEstadoCivil());

        PessoaEnum pessoa2 = new PessoaEnum();
        pessoa2.setNome("Maria");
        pessoa2.setIdade(35);
        pessoa2.setEmail("maria@live.com");
        pessoa2.setEstadoCivil(EstadoCivilEnum.CASADO);
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Email: " + pessoa2.getEmail());
        System.out.println("Estado Civil: " + pessoa2.getEstadoCivil());
    }
}
