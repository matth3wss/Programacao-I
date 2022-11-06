public class Investimento extends Conta {
    protected double taxaRendimento;

    Investimento(int numero, double saldo, double taxaRendimento) {
        super(numero, saldo);
        this.setTaxaRendimento(taxaRendimento);
    }

    @Override
    public void fazManutencao() {
        this.setSaldo(super.getSaldo() + super.getSaldo() * this.taxaRendimento);

        super.extrato.add(new Movimentacao(super.getSaldo() * this.taxaRendimento, 'C'));
    }

    @Override
    public void resumoExtrato() {
        super.resumoExtrato();
        System.out.println("% de rendimento: " + this.getTaxaRendimento());
        System.out.println();
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return this.taxaRendimento;
    }
}
