import java.util.Scanner;
import java.util.Scanner;

public class Mainfuncionario{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o valor da hora trabalhada: R$");
        funcionario.setValorHora(sc.nextDouble());

        System.out.println("Digite q quantidade de horas trabalhadas:");
        funcionario.setHorasTrabalhadas(sc.nextInt());

        funcionario.calcularSalario();
    }
}

