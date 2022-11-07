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
        // System.out.println("Teste de conta especial:");
        // contaEspecial.resumoExtrato();

        // System.out.println("\nTeste de conta especial:");
        // contaInvestimento.resumoExtrato();

        // System.out.println("\nSaque de R$ 500,00 na conta de " + contaEspecial.getCliente().getNome());
        contaEspecial.sacar(500);
        contaEspecial.resumoExtrato();
        
    }
}
