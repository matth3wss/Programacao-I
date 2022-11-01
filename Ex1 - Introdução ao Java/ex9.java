public class ex9 {
    public static void main(String[] args) {
        int[] n;
        n = new int[50];
        int soma = 0, count = 0;
        float media = 0;

        for (int i = 0; i < 50; i++) {
            n[i] = 1 + (int) (Math.random() * 100);
            soma += n[i];
        }
        media = soma / 50;
        soma = 0;
        for (int i = 0; i < 50; i++) {
            if (n[i] < media) {
                soma += n[i];
                count++;
            }
        }
        media = soma / count;
        System.out.println(media);

    }
}
