public class ContaEspecial extends Conta {
    protected double limite;
    protected double taxaManutencao;

    ContaEspecial(int numero, double saldo, double limite, double taxaManutencao) {
        super(numero, saldo);
        this.setLimite(limite);
        this.setTaxaManutencao(taxaManutencao);
    }

    @Override
    public boolean sacar(double valor) {
        if (super.sacar(valor) == true) {
            super.setSaldo(super.getSaldo() - valor);
            super.extrato.add(new Movimentacao(valor, 'D'));
            if (super.getSaldo() < this.getTaxaManutencao()) {
                this.fazManutencaoCredito();
            } else {
                this.fazManutencaoSaldo();
            }
            return true;

        } else if (super.getSaldo() + this.limite >= valor) {
            super.setSaldo(super.getSaldo() - super.getSaldo());
            this.sacarLimite(this.getLimite() - valor);
            super.extrato.add(new Movimentacao(valor, 'D'));
            this.fazManutencaoCredito();
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
    public void fazManutencaoSaldo() {
        super.setSaldo(super.getSaldo() - this.getTaxaManutencao());
        super.extrato.add(new Movimentacao(this.getTaxaManutencao(), 'M'));
    }

    @Override
    public void fazManutencaoCredito() {
        this.setLimite(this.getLimite() - this.getTaxaManutencao());
        super.extrato.add(new Movimentacao(this.getTaxaManutencao(), 'M'));

    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("Limite: " + this.getLimite());
        System.out.println("Taxa de Manutenção: " + this.getTaxaManutencao() + "\n");
        super.extrato();
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
