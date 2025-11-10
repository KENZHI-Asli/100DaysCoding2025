import java.util.Scanner;
public class day64 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan M: ");
        int m = up.nextInt();
        System.out.print("masukkan N: ");
        int n = up.nextInt();
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= m;
        }
        System.out.println("nilai "+m+" pangkat "+n+" adalah "+hasil);
    }
}
