import java.util.Scanner;
public class TUGAS7 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        int nilai;
        System.out.print("nilai :");
        nilai = up.nextInt();
        
        if (nilai >= 85) {
            System.out.println(nilai+"(A) anda lulus");
        }else if (nilai >= 80) {
            System.out.println(nilai+"(-A) anda lulus");
        }else if (nilai >= 75) {
            System.out.println(nilai+"(B+) anda lulus");
        }else if (nilai >= 70) {
            System.out.println(nilai+"(B) anda lulus");
        }else if (nilai >= 65) {
            System.out.println(nilai+"(-B) anda lulus");
        }else if (nilai >= 60){
            System.out.println(nilai +"(C+) anda lulus");
        }else if (nilai >= 50) {
            System.out.println(nilai+"(C) anda lulus");
        }else if (nilai >= 45) {
            System.out.println(nilai+"(D) tidak lulus");
        }else if (45>nilai) {
            System.out.println(nilai+"tidak lulus");
        }
    }
}
