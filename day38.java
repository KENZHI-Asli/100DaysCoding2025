import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        System.out.println("Pilihan Senjata");
        System.out.println("1. Ak47");
        System.out.println("2. M4");
        System.out.println("3. Shotgun");
        System.out.println("4. AWM");
        System.out.print("Menu Senjata : ");
        int S = menu.nextInt();        
        if (S == 1) {
            System.out.println("Memilih Ak47");
        }else if (S == 2) {
            System.out.println("Memilih M4");
        }else if(S == 3){
            System.out.println("Memilih Shotgun");
        }else if (S == 4) {
            System.out.println("Memilih AWM");
        }else System.out.println("tdk ada");
        menu.close();
    }  
}

