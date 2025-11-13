import java.util.Scanner;
public class day67 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan: ");
        int a = up.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("*");
        }
    }
}
