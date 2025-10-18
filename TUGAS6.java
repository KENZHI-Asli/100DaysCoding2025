import java.util.Scanner;
public class TUGAS6 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        int nilai_tes,tahun;
        String cumlaude;
        System.out.print("nilai tes : ");
        nilai_tes = up.nextInt();
        System.out.print("pengalaman kerja : ");
        tahun = up.nextInt();
        up.nextLine();
        System.out.print("lulusan cumlaude? (ya/tidak) : ");
        cumlaude = up.nextLine();
        if ( nilai_tes >= 80 && tahun >= 2 && cumlaude.equalsIgnoreCase("tidak")) {
            System.out.println("Di terima kerja");
        }else {
            System.out.println("tidak di terima");
        }
    }
}
