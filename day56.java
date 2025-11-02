import java.util.Scanner;
public class day56 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        int bo;
        do {
            System.out.print("masukkan angka: ");
            bo = up.nextInt();
            System.out.println("saya masukkan: "+bo);
        } while (bo != 0);
        System.out.println("Selesai");
    }
}
