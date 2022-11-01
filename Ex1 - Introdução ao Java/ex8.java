import java.util.Scanner;
public class ex8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n;
        int maior=0, menor=0;
        n = new int[10];

        for(int i=0; i<10; i++){
            n[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            if(i==0){
                maior=n[i];
                menor=n[i];
            }
            if(n[i]>maior){
                maior=n[i];
            }else if(n[i]<menor){
                menor=n[i];
            }
        }
        System.out.println("\n" + maior);
        System.out.println(menor);
        sc.close();
    }
        
}
