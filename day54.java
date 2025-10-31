import java.util.Scanner;
public class day54 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = up.nextInt();
        for (int i = 1; i <= nilai; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("angka "+i);
        }
        System.out.println("selesai");
    }
}
