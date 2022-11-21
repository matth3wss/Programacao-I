public class Cliente {
    private String nome;
    private String cpf;
    public Conta conta;

    Cliente() {
    }

    Cliente(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Conta getConta() {
        return this.conta;
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
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\n";
    }
}
