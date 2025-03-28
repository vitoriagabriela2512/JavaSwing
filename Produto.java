//- Atributos: `nome`, `preco`, `quantidade`
//- Método `calcularTotal()`: retorna `preco * quantidade`

public class Produto {

    String nome;
    double preco;
    int qntd;

    public Produto(String nome, double preco, int qntd) {
        this.nome = nome;
        this.preco = preco;
        this.qntd = qntd;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQntd() {
        return qntd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    public double CalcularTotal(){
    return preco * qntd;
    }
}
