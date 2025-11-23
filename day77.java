import java.util.Scanner;
public class day77 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan kata:");
        String a = up.nextLine();
        System.out.println("trim:"+a.trim());
        System.out.println("Substring:"+a.substring(0,4));
        System.out.println("replace:"+a.replace("b","h"));
    }
}
