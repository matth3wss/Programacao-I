import java.util.Scanner;
class test {
  public static void main (String[] args) {

    Apolice p1 = new Apolice();
    Scanner sc = new Scanner(System.in);
    String cidade;

    p1.nomeSegurado=sc.nextLine();
    p1.idade=sc.nextInt();
    p1.valorPremio=sc.nextFloat();

    sc.nextLine();
    cidade=sc.nextLine();

    p1.calcularPremio();
    p1.imprimir();
    System.out.println("Valor do desconto: "+p1.oferecerDesconto(cidade));

    String nomeSegurado;
    int idade;
    float valorPremio;

    nomeSegurado = sc.nextLine();
    idade = sc.nextInt();
    valorPremio = sc.nextFloat();
    
    sc.nextLine();
    cidade=sc.nextLine();

    Apolice p2 = new Apolice(nomeSegurado, idade, valorPremio);
    p2.calcularPremio();
    p2.imprimir();
    System.out.println("Valor do desconto: "+p2.oferecerDesconto(cidade));
    Apolice.exibeUltimoNum();

    }
}