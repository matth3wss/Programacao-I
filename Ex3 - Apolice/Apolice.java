class Apolice {

    int numApolice;
    String nomeSegurado;
    int idade;
    float valorPremio;
    static int ultimoNumApolice = 0;

    Apolice(String nomeSegurado, int idade, float valorPremio) {
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
        ultimoNumApolice++;

    }

    Apolice() {
        ultimoNumApolice++;
        numApolice = ultimoNumApolice;
    }

    void imprimir() {
        System.out.println("Número Apolice: " + numApolice);
        System.out.println("Nome: " + nomeSegurado);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do Premio: " + valorPremio);
    }

    void calcularPremio() {
        if (this.idade >= 18 && this.idade <= 25) {
            this.valorPremio += valorPremio * 0.2;
        }
        if (this.idade > 25 && this.idade <= 36) {
            this.valorPremio += valorPremio * 0.15;
        }
        if (this.idade > 36) {
            this.valorPremio += valorPremio * 0.10;
        }
    }

    float oferecerDesconto(String cidade) {
        if (cidade.equals("Florianópolis")) {
            this.valorPremio -= valorPremio * 0.95;
            return this.valorPremio;
        }
        if (cidade.equals("Chapecó")) {
            this.valorPremio -= valorPremio * 0.94;
            return this.valorPremio;
        }
        if (cidade.equals("Joaçaba")) {
            this.valorPremio -= valorPremio * 0.93;
            return this.valorPremio;
        }
        if (cidade.equals("Joinville")) {
            this.valorPremio -= valorPremio * 0.92;
            return this.valorPremio;
        }
        return this.valorPremio;
    }

    static void exibeUltimoNum() {
        System.out.println(Apolice.ultimoNumApolice);
    }
}
