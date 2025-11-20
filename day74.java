import java.util.Scanner;
public class day74 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        int pilih;
        do {
        System.out.println(" Menu Makanan ");
        System.out.println("1. Mie");
        System.out.println("2. Bakso");
        System.out.println("3. Keluar");
        System.out.print("pilih: ");
        pilih = up.nextInt();
        switch  (pilih){
            case 1:
                System.out.println("harga 10k");
                break;
            case 2:
                System.out.println("harga 20k");
                break;
            case 3:
                System.out.println("keluar");
                break;
            default:
                System.out.println("pilihan tdk ada");
        }
            System.out.println();
        }while (pilih != 3);
    }
}
