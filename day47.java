import java.util.Scanner;
public class day47 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("Masukkan Angka hari 1-7: ");
        int hari = up.nextInt();
        switch (hari){
            case 1:
                System.out.println("hari Senin");
                break;
            case 2:
                System.out.println("hari Selasa");
                break;
            case 3:
                System.out.println("hari Rabu");
                break;
            case 4:
                System.out.println("hari Kamis");
                break;
            case 5:
                System.out.println("hari Jumat");
                break;
            case 6:
                System.out.println("hari Sabtu");
                break;
            case 7:
                System.out.println("hari Minggu");
                break;
            default:
                System.out.println("tdk ada angka hari");
        }
    }
}
