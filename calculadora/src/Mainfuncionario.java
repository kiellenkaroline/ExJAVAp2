import java.util.Scanner;

public class Mainfuncionario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario novoFunc = new Funcionario();
        String sair;
        do {
            System.out.println("Dados do funcionario");

            System.out.println("Matricula: ");
            novoFunc.matricula = sc.nextInt();
            sc.nextLine();

            System.out.println("Nome completo: ");
            novoFunc.nome = sc.nextLine();

            System.out.println("Salario bruto: ");
            novoFunc.salarioBruto = sc.nextDouble();

            novoFunc.calculoINSS();

            System.out.println("Matricula: " + novoFunc.matricula);
            System.out.println("Nome completo:" + novoFunc.nome);
            System.out.println("Salario bruto: R$ " + novoFunc.salarioBruto);
            System.out.println("Reducao INSS: R$ " + novoFunc.descontoINSS);
            System.out.println("Salario liquido: R$ " + novoFunc.salarioLiquido);

            System.out.println("Deseja repetir o processo? (S/N): ");
            sair = sc.next();
        }while (sair.equalsIgnoreCase("S"));
    }
}
