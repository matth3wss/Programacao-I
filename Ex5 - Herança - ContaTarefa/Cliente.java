public class Cliente {
    private String nome;
    private String cpf;
    public Conta conta;

    Cliente(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
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

}
