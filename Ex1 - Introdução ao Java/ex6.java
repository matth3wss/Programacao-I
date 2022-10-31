public class ex6 {
    public static void main(String[] args) {
      int primos = 0;
      int div;
      int i, j;
      
      for (i = 1; primos < 15; i++) {
        div = 0;
        for (j = 1; j <= i; j++) {
          if (i % j == 0) {
            div++;
          }
        }
        if (div == 2) {
          primos++;
          System.out.print(i + " ");
        }
      }
      System.out.println("");
    }
  }
  