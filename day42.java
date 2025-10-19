import java.util.Scanner;        
public class day42 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        int gajiA,gajiB,gaji_bersih,potongan;
        System.out.print("Masukkan gaji a: ");
        gajiA = up.nextInt();
        System.out.print("Masukkan gaji b: ");
        gajiB = up.nextInt();
        System.out.print("Masukkan potongan: ");
        potongan = up.nextInt();        
        gaji_bersih = gajiA + gajiB - potongan;
        System.out.println("gaji bersih "+gaji_bersih);
        if (gaji_bersih > 50000) {
            System.out.println("keterangan: gaji tinggi ");
        }else if (gaji_bersih > 30000) {
            System.out.println("keterangan: gaji cukup");
        }else {
            System.out.println("keterangan: gaji rendah");
        }
    }
}
