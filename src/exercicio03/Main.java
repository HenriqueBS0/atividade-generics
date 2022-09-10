package exercicio03;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionar(new Produto(1, (float) 1.2, "Bala"));
        pedido.adicionar(new Produto(43, (float) 12.45, "Guaxinim"));

        System.out.println(pedido.getListaProdutos());
    }
}
