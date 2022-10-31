package Aula_4.Atividade_1;

import java.util.Scanner;

public class teste {
    public static Acampamento[] p = new Acampamento[10];
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<p.length; i++) {
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            sc.nextLine();

            p[i] = new Acampamento(nome, idade);
            p[i].definirEquipe();
        }
        sc.close();

        for (int i=0; i<p.length; i++) {
            System.out.println(p[i].toString());
        }
    }
        
}
