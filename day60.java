import java.util.Scanner;
public class day60 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan N: ");
        int n = up.nextInt();
        System.out.print("angka ganjil: ");
        for (int i = n; i >= 1 ; i--) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }
        System.out.print("\nangka genap: ");
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }
    }
}
