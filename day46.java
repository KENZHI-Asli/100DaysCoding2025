import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.println("paket belajar");
        System.out.println("1.Paket A");
        System.out.println("2.Paket B");
        System.out.println("3.Paket C");
        System.out.print("Paket Nomor Berapa: ");
        int paket = up.nextInt();
        int a;
        switch (paket){
        case 1:
            System.out.println("Paket A "+(a = 20000));
            break;
        case 2:
            System.out.println("Paket B "+(a = 40000));
            break;
        case 3:
            System.out.println("Paket C "+(a = 75000));
            break;
        default:
            System.out.println("tdk ada paket yang di temukan");
        }
    }
}
