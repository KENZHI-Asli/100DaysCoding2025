import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        int n = up.nextInt();
        System.out.print("bilangan ganjil: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }
        System.out.print("\nbilangan genap: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }               
    }
}
