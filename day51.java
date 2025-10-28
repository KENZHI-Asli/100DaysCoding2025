import java.util.Scanner;
public class day51 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int as = up.nextInt();
        for (int i = 1; i <= as; i++) {
            System.out.println("angka "+i);
        }
    }
}
