
import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        
        System.out.print("masukkan nilai pertama : ");
        int a = nilai.nextInt();
        
        System.out.print("masukkan nilai kedua : ");
        int b = nilai.nextInt();
        
        System.out.println("hasil nilai kurang dari : "+a +" < "+b+(a < b));
        System.out.println("hasil nilai lebih dari: "+a+" > "+b+(a > b));
    }
}
