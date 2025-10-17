import java.util.Scanner;
public class day40 {
    public static void main(String[] args) {
        Scanner ha = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int bilangan = ha.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }
    }
}
