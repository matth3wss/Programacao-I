public class ex10 {
    public static int TAM = 4;

    public static void main(String[] args) {
        int[][] n = new int[TAM][TAM];
        int count = 1, soma = 0;

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                n[i][j] = 1 + (int) (Math.random() * 9);
                System.out.print(n[i][j] + " ");
                // System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (i == count && j < i) {
                    System.out.print(i + "" + j + "=" + n[i][j] + " ");
                    soma += n[i][j];
                }
            }
            count++;
        }
        System.out.println();
        System.out.println(soma);
    }
}
