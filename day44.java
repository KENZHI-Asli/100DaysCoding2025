import java.util.Scanner;
public class day44 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int angka = up.nextInt();
         if (angka < 0 || angka > 100) {
            System.out.println("Nilai harus 0 sampai 100!");
         }else if (angka >= 90) {
            System.out.println(angka+" dapat A");
        }else if (angka >= 80) {
            System.out.println(angka+" dapat B");
        }else if (angka >= 70) {
            System.out.println(angka+" dapat C");
        }else if (angka >= 60) {
            System.out.println(angka+" dapat D");
        }else {
            System.out.println(angka+" dapat E");
        }
    }
}
