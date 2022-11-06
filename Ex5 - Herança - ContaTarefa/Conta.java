import java.util.ArrayList;

public abstract class Conta {
    protected String nome;
    protected int numero;
    protected double saldo;
    public Cliente cliente;

    ArrayList<Movimentacao> extrato = new ArrayList<Movimentacao>();

    Conta() {
    }

    Conta(String nome, int numero, double saldo) {
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setNome(nome);
    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.extrato.add(new Movimentacao(valor, 'C'));

        } else {
            System.out.println("Valor inválido");
        }

    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            this.extrato.add(new Movimentacao(valor, 'D'));
            return true;
        }
        System.out.println();
        return false;
    }

    public abstract void fazManutencao();

    public void resumoExtrato() {
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        for (Movimentacao movimentacao : extrato) {
            System.out.println(movimentacao.toString());
        }
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
