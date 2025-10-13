import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int nilai = in.nextInt();
        if (nilai >=  70) {
            System.out.println("lulus");
            if (nilai >= 90) {
                System.out.println("dapat A");
            }else if (nilai >= 80) {
                System.out.println("dapat B");
            }else System.out.println("dapat C");
        }else{
            System.out.println("tidak lulus");
        }
        in.close();
            
    }
}
