import java.util.Scanner;

public class Mainpessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Informe a idade: ");
        p.idade = sc.nextInt();

        System.out.println("Informe o nome: ");
        p.nome = sc.next();


        System.out.println("Nome: " + p.nome);
        System.out.println("Idade atual:" + p.idade);
        p.niver();


        System.out.println("Idade futura: " + p.idade);
    }
}
