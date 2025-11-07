import java.util.Scanner;
public class day61 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan N: ");
        int n = up.nextInt();
        System.out.print("masukkan M: ");
        int m = up.nextInt();
        System.out.println("bilangan kelipatan "+m+" dari 1 sampai "+n+" adalah: ");
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
