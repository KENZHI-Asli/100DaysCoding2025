import java.util.Scanner;
public class day75 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan kata: ");
        String kata = up.nextLine();
        
        System.out.println("panjang kata: "+kata.length());
        System.out.println("uppercase   : "+kata.toUpperCase());
        System.out.println("Lowercase   : "+kata.toLowerCase());
    }
}
