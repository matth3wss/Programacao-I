public class Cliente extends Conta {
    private String nome;
    private String cpf;
    public Conta conta;
    public CarteiraPrime carteiraPrime;

    Cliente() {
    }

    Cliente(String nome, int numero, double saldo, String cpf) {
        super(nome, numero, saldo);
        this.setCpf(cpf);
    }

    @Override
    public void fazManutencao() {
        // TODO Auto-generated method stub
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String toString() {
        return "Nome: " + this.getNome() + "\nNúmero: " + this.getNumero() + "\nSaldo: " + this.getSaldo() + "\nCPF: "
                + this.getCpf() + "\n";
    }

}
