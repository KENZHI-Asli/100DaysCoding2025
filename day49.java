import java.util.Scanner;
public class day49 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = up.nextInt();        
        String hasil = (angka % 2 == 0)?"genap":"ganjil";
        System.out.println("hasilnya: "+ hasil);
    }
}
