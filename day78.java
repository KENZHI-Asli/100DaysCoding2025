import java.util.Scanner;
public class day78 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        System.out.print("masukkan kata:");
        String a = up.nextLine();
        System.out.println("length:"+a.length());
        System.out.println("upper:"+a.toUpperCase());
        System.out.println("lower:"+a.toLowerCase());
        System.out.println("trim:"+a.trim());
        System.out.println("substring:"+a.substring(0,5));
        System.out.println("replace:"+a.replace("a","#"));
        System.out.println("equals:"+a.equals("baha"));
        System.out.println("contains:"+a.contains("ha"));
    }
}
