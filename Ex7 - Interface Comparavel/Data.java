public class Data implements Comparavel{
    private int dia;
    private int mes;
    private int ano;


    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getDataFormatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    @Override
    public boolean igual(Comparavel obj) {
        Data a = (Data) obj;

        

        // if()
        return false;
    }

    @Override
    public boolean maior(Comparavel obj) {
        return false;
    }

    @Override
    public boolean menor(Comparavel obj) {
        return false;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }





}
