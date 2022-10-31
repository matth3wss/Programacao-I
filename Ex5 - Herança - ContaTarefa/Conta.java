public class Conta {
    private String nome;
    private int numero;
    private double saldo;
    

    Conta() {
    }

    Conta(String nome, int numero, double saldo){
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setNome(nome);
    }

    void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido");
        }

    }

    public boolean sacar(double valor){
        if (this.saldo >= valor && valor > 0) {
            this.saldo -= valor;
            return true;
        }
        System.out.println();
        return false;
    }

    public void resumoExtrato() {
        System.out.println();
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
    }

    public void fazManutencao(){
    }

    public void setNumero(int numero) {
        this.numero=numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getNome() {
        return this.nome;
    }
}

