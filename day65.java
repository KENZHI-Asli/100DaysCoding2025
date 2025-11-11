import java.util.Scanner;
public class day65 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = ip.nextInt();
        int faktorial = 1;
        System.out.print(n+"! = ");
        for (int i = n; i >= 1; i--) {
            faktorial *= i; 
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = "+faktorial);
    }
}
