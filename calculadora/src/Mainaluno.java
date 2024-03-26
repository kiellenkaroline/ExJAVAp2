import java.util.Scanner;

public class Mainaluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno p = new Aluno();

        System.out.println("Informe sua primeira nota: ");
        p.nota1 = sc.nextInt();
        System.out.println("Informe sua segunda nota: ");
        p.nota2 = sc.nextInt();
        System.out.println("Informe sua terceira nota: ");
        p.nota3 = sc.nextInt();



        p.calcularMedia();

        System.out.println("A média final:" + p.media);
    }
}
