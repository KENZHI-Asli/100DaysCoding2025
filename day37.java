import java.util.Scanner;
public class day37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int bilangan = input.nextInt();
        
        if (bilangan > 0) {
            System.out.println("Positif");
        }else if (bilangan < 0) {
            System.out.println("Negatif");
        }else{
            System.out.println("bilangan nol");
        }
    }
    
}
