public class Imc {
    private double Peso, Altura, Imc;



    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public double getAltura() {
        return Altura;
    }
    public void calcularIMC() {
        Imc = Peso / (Altura * Altura);
        System.out.println("O seu IMC é:" + Imc);
    }
}
