import java.util.Scanner;
public class TUGAS8 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        String gender;
        int umur;
        System.out.print("gender : ");
        gender = up.nextLine();
        System.out.print("umur : ");
        umur = up.nextInt();
        
        if (gender.equalsIgnoreCase("laki-laki")) {
            if (umur >= 18) {
                System.out.println("anda seorang laki-laki berumur "+umur+" tahun sudah dewasa");      
        }else if (umur >= 13) {
                System.out.println("anda seorang laki-laki berumur "+umur+" tahun sudah remaja");
            }else
                System.out.println("anda seorang laki-laki berumur "+umur+" tahun masih anak-anak");
        }
    }
    }

        
