import java.util.Scanner;

public class Mainpessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite a sua idade:");
        pessoa.setIdade(sc.nextInt());
        System.out.println("Idade:" + pessoa.getIdade());
        System.out.println("Digite seu nome:");
        pessoa.setNome(sc.nextLine());
        System.out.println("Nome:" + pessoa.getNome());
    }
}
