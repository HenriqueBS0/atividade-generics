package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos = new ArrayList<Produto>();

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }   

    public String getListaProdutos() {
        StringBuilder lista = new StringBuilder();
        int posicao = 0;

        for (Produto produto : produtos) {
            posicao++;
            lista.append(String.format("\n%d - %s", posicao, produto));
        }
        
        return lista.toString();
    }
}
