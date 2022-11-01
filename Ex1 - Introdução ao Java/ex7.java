public class ex7 {
  public static void main(String[] args) {
    int div;
    int i, j;

    for (i = 100; i <= 200; i++) {
      div = 0;
      for (j = 1; j <= i; j++) {
        if (i % j == 0) {
          div++;
        }
      }
      if (div == 2) {
        System.out.print(i + " ");
      }

    }
    System.out.println("");
  }
}
