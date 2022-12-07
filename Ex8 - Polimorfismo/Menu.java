import java.util.Scanner;

public class Menu {
    public int menu(Scanner sc) {
        int op;

        System.out.println("BLOG: O que você quer fazer?");
        System.out.println("(1) - Novo post de noticia.");
        System.out.println("(2) - Nova resenha de produto.");
        System.out.println("(3) - Novo post de outros assuntos.");
        System.out.println("(4) - Listar todas os posts.");
        System.out.println("(5) - Dar like no post.");
        System.out.println("(6) - Dar dislike no post.");
        System.out.println("(10) - Sair.");
        System.out.print("Escolha a opção: ");
        op = sc.nextInt();
        System.out.println("");
        return op;   
    }
}
