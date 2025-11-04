import java.util.Scanner;
public class day58 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan n: ");
        int n = up.nextInt();
            System.out.println("mencetak 1 ke "+n+":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i+"");
        }
            System.out.println("\nmencetak "+n+" ke 1:");
        for (int i = n; i >= 1; i--) {
            System.out.print(i+"");
        }
                
    }
}
