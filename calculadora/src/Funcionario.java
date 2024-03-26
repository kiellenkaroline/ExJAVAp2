public class Funcionario {
    int matricula;
    String nome;
    double salarioBruto;
    double descontoINSS;
    double salarioLiquido;
    public void calculoINSS (){
        descontoINSS = salarioBruto * 0.15;
        salarioLiquido = salarioBruto - descontoINSS;
    }
}
