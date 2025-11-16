import java.util.Scanner;
public class day70 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan tinggi: ");
        int t = up.nextInt();
        System.out.print("masukkan lebar: ");
        int l = up.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
