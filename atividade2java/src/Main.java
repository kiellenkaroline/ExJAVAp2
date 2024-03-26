public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto("Calça", 99.99, "Calça jeans preta");

        System.out.println("Informações do produto 1:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$" + produto1.getPreco());
        System.out.println("Descrição: " + produto1.getDescricao());

        System.out.println("Informações do produto 2:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço: R$" + produto2.getPreco());
        System.out.println("Descrição: " + produto2.getDescricao());
    }
}
