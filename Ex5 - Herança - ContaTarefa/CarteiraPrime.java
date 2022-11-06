import java.util.ArrayList;

public class CarteiraPrime extends Cliente {

    ArrayList<Cliente> clientesPrime = new ArrayList<Cliente>();

    CarteiraPrime(String nome, int numero, double saldo, String cpf) {
        this.clientesPrime.add(new Cliente(nome, numero, saldo, cpf));
    }

    public void listarPrime() {
        for (Cliente clientes : clientesPrime) {
            clientes.toString();
        }
    }

    // public String toString() {
    // return "Nome: " + this.clientesPrime.get(numero) + "\nValor: " +
    // this.getValor() + "\nTipo: " + this.getTipo() + "\n";
    // }
}