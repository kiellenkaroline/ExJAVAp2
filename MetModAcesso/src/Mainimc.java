import java.util.Scanner;
public class Mainimc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Imc i = new Imc();

        System.out.println("Digite o seu peso:");
        i.setPeso(sc.nextDouble());

        System.out.println("Digite sua altura:");
        i.setAltura(sc.nextDouble());

        i.calcularIMC();
    }
}
