import java.util.ArrayList;



public class GerenciadorProdutos {
     private ArrayList<Produto> produtos;

    public GerenciadorProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
        System.out.println("Produto adicionado: " + p.getNome());
    }

    public String listarProdutos() {
        if (produtos.isEmpty()) {
            return "Nenhum produto cadastrado.";
        } else {
            StringBuilder lista = new StringBuilder("Lista de Produtos:\n");
            for (Produto p : produtos) {
                lista.append("- ").append(p.getNome())
                     .append(" (Preço: ").append(p.getPreco())
                     .append(", Quantidade: ").append(p.getQntd())
                     .append(", Total: ").append(p.CalcularTotal())
                     .append(")\n");
            }
            return lista.toString();
        }
    }
     
}
