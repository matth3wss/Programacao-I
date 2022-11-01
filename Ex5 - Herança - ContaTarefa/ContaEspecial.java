public class ContaEspecial extends Conta {
    protected double limite;
    protected double taxaManutencao;

    ContaEspecial() {
    }

    ContaEspecial(String nome, int numero, double saldo, double limite, double taxaManutencao) {
        super(nome, numero, saldo);
        this.setLimite(limite);
        this.setTaxaManutencao(taxaManutencao);
    }

    @Override
    public boolean sacar(double valor) {
        double aux;
        if (super.sacar(valor) == true) {
            super.sacar(valor);
            super.extrato.add(new Movimentacao(valor, 'D'));
            this.fazManutencao();
            return true;
        } else if (super.getSaldo() + this.limite >= valor) {
            super.sacar(aux = super.getSaldo());
            this.sacarLimite(valor - aux);
            super.extrato.add(new Movimentacao(valor, 'D'));
            this.fazManutencao();
            return true;
        } else {
            System.out.println("Crédito insuficiente");
        }
        return false;
    }

    public boolean sacarLimite(double valor) {
        if (this.getLimite() < valor) {
            System.out.println("Limite insuficiente");
            return false;
        } else {
            this.setLimite(this.getLimite() - valor);
            return true;
        }
    }

    @Override
    public void fazManutencao() {
        super.setSaldo(super.getSaldo() - this.getTaxaManutencao());
        super.extrato.add(new Movimentacao(super.getSaldo() - this.getTaxaManutencao(), 'M'));
    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("Limite: " + this.getLimite());
        System.out.println("Taxa de Manutenção: " + this.getTaxaManutencao());
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return this.taxaManutencao;
    }
}
