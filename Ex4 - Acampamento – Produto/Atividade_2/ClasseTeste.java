import java.util.ArrayList;
import java.util.Scanner;

public class ClasseTeste {

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("(1) - Cadastrar Produto");
        System.out.println("(2) - Consultar estoque");
        System.out.println("(3) - Remover unidades ");
        System.out.println("(4) - Adicionar unidades");
        System.out.println("(9) - Sair");
        op=sc.nextInt();
        System.out.println("");

        return op;
    }
    public static void main (String[] args) {

        String nome;
        Float valor;
        int qtde, cod, op=0;

        ArrayList<Produto> estoque = new ArrayList <Produto>();
        Scanner sc = new Scanner(System.in);

        Produto t = new Produto("Matheus", 89.5, 8);
        Produto t1 = new Produto("Alice", 50.65, 4);
        Produto t2 = new Produto("Deliana", 1.99, 1);

        estoque.add(t);
        estoque.add(t1);
        estoque.add(t2);

        while(op!=9){
            op=menu();

            switch (op) {
                case 1:
                    System.out.print("Nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Valor do produto: ");
                    valor = sc.nextFloat();
                    System.out.print("Quantidade: ");
                    qtde = sc.nextInt();

                    Produto p = new Produto(nome, valor, qtde);
                    estoque.add(p);
                    break;

                case 2:
                    System.out.print("Código produto: ");
                    cod=sc.nextInt();
                    System.out.print("\n" + estoque.get(cod).toString() + "\n");
                    break;
                case 3:
                    System.out.print("Código produto: ");
                    cod=sc.nextInt();

                    System.out.print("Qtde a ser removida: ");
                    qtde = sc.nextInt();

                    if(estoque.get(cod).verificarDisponibilidade(qtde)==true){
                        estoque.get(cod).removerUnidades(qtde);
                        System.out.println("Remoção bem-sucedida");
                    }else{
                        System.out.println("Remoção mal-sucedida");
                    }
                    break;
                case 4:
                    System.out.print("Código produto: ");
                    cod=sc.nextInt();

                    System.out.print("Qtde a ser adicionada: ");
                    qtde = sc.nextInt();
                    estoque.get(cod).adicionarUnidades(qtde);
                    break;

                default: 
                    System.out.println("Opção Inválida\n");
            }
        }
        sc.close();
    }
}
