public class Funcionario {
    private double valorHora, salario;
    private int horasTrabalhadas;

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void calcularSalario(){
        salario = valorHora * horasTrabalhadas;
        System.out.println("O valor do salário é:" + salario);
    }
}