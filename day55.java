import java.util.Scanner;
public class day55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan jumlah nilai: ");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();

        int min = a[0], max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }
        System.out.println("nilai Min: "+min);
        System.out.println("nilai Max: "+max);
    }
}
