import java.util.Scanner;
public class day62 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan N: ");
        int n = up.nextInt();
        int jumlah = 0;
        for (int i = 1; i <= n; i++) {
            jumlah += i;
        }
        System.out.println("jumlah 1 sampai "+n+" adalah "+jumlah);
    }
}
