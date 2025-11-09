import java.util.Scanner;
public class day63 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan N: ");
        int n = up.nextInt();
        int kali = 1;
        for (int i = 1; i <= n; i++) {
            kali *= i;
        }
        System.out.println("perkalian nilai "+n+" adalah "+kali);
    }
}
