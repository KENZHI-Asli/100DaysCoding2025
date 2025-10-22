import java.util.Scanner;
public class day45 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int a = up.nextInt();
        String namaHp;
        switch (a){
        case 1:
            namaHp = "Xiaomi";
            break;
        case 2:
            namaHp = "Vivo";
            break;
        case 3:
            namaHp = "Infinix";
            break;
        default:
            namaHp = "Tdk ada pilihan HP";
        }
        System.out.println("Hp yang dipilih "+a+" Merek "+namaHp);
    }
}
