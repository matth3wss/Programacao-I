public class Teste {
    public static void main(String[] args) {
        Cliente Matheus = new Cliente("Matheus", "041.810.841.-24");
        ContaEspecial contaEspecial = new ContaEspecial(001, 1000, 500, 10);
        contaEspecial.setCliente(Matheus);
        Matheus.setConta(contaEspecial);

        // Instanciando um cliente e uma conta investimento
        Cliente Nicolas = new Cliente("Nicolas", "013.728.919-78");
        Investimento contaInvestimento = new Investimento(002, 1113, 0.15);
        contaInvestimento.setCliente(Nicolas);
        Nicolas.setConta(contaInvestimento);

        // TESTE CONTA ESPECIAL
        System.out.println("Teste de conta especial:");

        contaEspecial.sacar(500);
        contaEspecial.resumoExtrato();

        // contaEspecial.sacar(490);
        // contaEspecial.resumoExtrato();

        // contaEspecial.sacar(50);
        // contaEspecial.resumoExtrato();

        // System.out.println("\nTeste de conta investimento:");
        // contaInvestimento.resumoExtrato();

        // contaInvestimento.sacar(500);
        // contaInvestimento.resumoExtrato();

        // contaInvestimento.depositar(250);
        // contaInvestimento.resumoExtrato();

        // contaInvestimento.sacar(1000);
        // contaInvestimento.resumoExtrato();

        // contaInvestimento.fazManutencaoSaldo();
        // contaInvestimento.resumoExtrato();

        // // ADICIONANDO A CARTEIRA PRIME
        // CarteiraPrime clientesPrime = new CarteiraPrime();
        // clientesPrime.adicionar(Matheus);
        // clientesPrime.adicionar(Nicolas);
        // clientesPrime.listarPrime();

    }
}
