import java.util.Scanner;
public class day73 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        int s = 0;
        while (true){
            System.out.print("masukkan angka: ");
            int x = up.nextInt();
            if (x < 0) {
                break;
            }
            s += x;
        }
        System.out.println("total angka "+s);
    }
}
