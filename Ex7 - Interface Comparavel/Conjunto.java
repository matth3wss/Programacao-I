public class Conjunto implements Comparavel {
    private int elemento1;
    private int elemento2;

    Conjunto(int elemento1, int elemento2) {

    }

    public int soma() {
        return this.elemento1 + this.elemento2;
    }

    public String parOrdenado() {
        return "<" + this.elemento1 + ", " + this.elemento2 + ">";
    }

    @Override
    public boolean igual(Comparavel obj) {
        Conjunto conjunto = (Conjunto) obj;
        if (this.soma() == conjunto.soma()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean menor(Comparavel obj) {
        Conjunto conjunto = (Conjunto) obj;

        if(this.soma() < conjunto.soma()){
            return true;
        }

        return false;
    }

    @Override
    public boolean maior(Comparavel obj) {
        Conjunto conjunto = (Conjunto) obj;

        if (this.soma() > conjunto.soma()){
            return true;
        }
            return false;
    }

    public int getElemento1() {
        return elemento1;
    }

    public void setElemento1(int elemento1) {
        this.elemento1 = elemento1;
    }

    public int getElemento2() {
        return elemento2;
    }

    public void setElemento2(int elemento2) {
        this.elemento2 = elemento2;
    }

}
