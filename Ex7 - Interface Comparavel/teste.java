public class teste {
    public static void main(String[] args) {
        Data data1 = new Data(12, 12, 2001);
        Data data2 = new Data(29, 11, 1965);

        Conjunto conj1 = new Conjunto(100, 30);
        Conjunto conj2 = new Conjunto(20, 30);

        if (conj1.igual(conj2)) {
            System.out.println("Os conjuntos são IGUAIS");
        }
        if (conj1.menor(conj2)) {
            System.out.println("O conjunto 1 é MENOR");
        }
        if (conj1.maior(conj2)) {
            System.out.println("O conjunto 1 é MAIOR");
        }

        System.out.println();

        if (data1.igual(data2)) {
            System.out.println("As data são IGUAIS");
        }
        if (data1.menor(data2)) {
            System.out.println("A data 1 é MENOR ");
        }
        if (data1.maior(data2)) {
            System.out.println("A data 1 é MAIOR");
        }
    }

}
