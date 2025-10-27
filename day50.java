import java.util.Scanner;
public class day50 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int nilai = up.nextInt();
        String hasil = (nilai % 2 == 0)?"genap":"ganjil";
        System.out.println("hasil nilai ini adalah "+hasil);
    }
}
