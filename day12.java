import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" MASUKKAN BIODATA ");
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();     
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();   
        System.out.print("Masukkan Email: ");
        String email = scanner.nextLine();       
        System.out.print("Masukkan Nomor HP: ");
        String noHp = scanner.nextLine();

        System.out.println("\n\n================================");
        System.out.println("        BIODATA ANDA");
        System.out.println("==================================");
        System.out.println("Nama Lengkap   : " + nama);
        System.out.println("Tempat Lahir   : " + tempatLahir);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Email          : " + email);
        System.out.println("Nomor HP       : " + noHp);      
        scanner.close();
    }
}