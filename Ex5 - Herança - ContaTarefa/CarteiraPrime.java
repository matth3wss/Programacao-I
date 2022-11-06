import java.util.ArrayList;

public class CarteiraPrime extends Cliente {

    private ArrayList<Cliente> clientesPrime = new ArrayList<Cliente>();

    public void adicionarCliente(Cliente cliente) {
        clientesPrime.add(cliente);
    }

    public void listarPrime() {
        for (Cliente clientes : clientesPrime) {
            clientes.toString();
        }
    }
}