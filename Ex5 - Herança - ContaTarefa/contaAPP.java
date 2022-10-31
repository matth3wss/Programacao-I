public class contaAPP {
    public static void main(String[] args) {
        Conta c1 = new Conta("Matheus", 15, 2000.00);
        
        ContaEspecial c_esp = new ContaEspecial("Alice", 58, 500, 5000, 10);
        Investimento inv = new Investimento("Alcides", 96, 7800, 0.89);

        // c1.resumoExtrato();
        // c1.depositar(500);
        // c1.resumoExtrato();

        c_esp.resumoExtrato();
        c_esp.depositar(1000);

        c_esp.resumoExtrato();

        c_esp.sacar(7000);
        c_esp.resumoExtrato();


        // inv.resumoExtrato();
        // inv.fazManutencao();
        // inv.resumoExtrato();
    }
}
