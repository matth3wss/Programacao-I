public class Investimento extends Conta {
    protected double taxaRendimento;

    Investimento() {
    }

    Investimento(String nome, int numero, double saldo, double taxaRendimento) {
        super(nome, numero, saldo);
        this.setTaxaRendimento(taxaRendimento);
    }

    @Override
    public void fazManutencao() {
        this.setSaldo(super.getSaldo() + super.getSaldo() * this.taxaRendimento);
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
