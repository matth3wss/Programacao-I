import java.text.SimpleDateFormat;
import java.util.Date;

public class Movimentacao {
    private String data;
    private double valor;
    private char tipo;

    Movimentacao() {
    }

    Movimentacao(double valor, char tipo) {
        this.setData();
        this.setValor(valor);
        this.setTipo(tipo);
    }

    public void setData() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date data = new Date();
        this.data = formatter.format(data);
    }

    public String toString() {
        return "\nData: " + this.getData() + "\nValor: " + this.getValor() + "\nTipo: " + this.getTipo();
    }

    public String getData() {
        return this.data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getTipo() {
        return this.tipo;
    }
}
