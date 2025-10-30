import java.util.Scanner;
public class day53 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = up.nextInt();
        for (int i = 1; i <= angka; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("hasil "+i);
        }
        System.out.println("selesai");
    }
}
