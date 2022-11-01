public class Produto {
    private String nome;
    private double valor;
    private int quantidade;

    Produto(String nome, double valor, int quantidade) {
        this.setNome(nome);
        this.setValor(valor);
        this.setQuantidade(quantidade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setQuantidade(int qtde) {
        this.quantidade = qtde;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public boolean verificarDisponibilidade(int qtde) {
        if (this.quantidade >= qtde && qtde > 0) {
            return true;
        }
        return false;
    }

    public void adicionarUnidades(int qtde) {
        if (qtde > 0) {
            this.quantidade += qtde;
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public String toString() {
        return "Nome: " + getNome() + "\nValor: " + getValor() + "\nQuantidade: " + getQuantidade() + "\n";
    }

    public boolean removerUnidades(int qtde) {
        if (verificarDisponibilidade(qtde) == true) {
            this.quantidade -= qtde;
            return true;
        }
        return false;
    }
}
