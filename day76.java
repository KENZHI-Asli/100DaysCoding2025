import java.util.Scanner;
public class day76 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan huruf: ");
        String a = up.nextLine();
        System.out.println("equals: "+a.equals("ba"));
        System.out.println("equalsIgnoreCase: "+a.equalsIgnoreCase("ba"));
        System.out.println("contains: "+a.contains("lon"));
        System.out.println("isEmpty: "+a.isEmpty());
    }
}
