import java.util.Scanner;
public class day48 {
    public static void main(String[] args) {
        Scanner up = new Scanner(System.in);
        int angka1,angka2,hasil;
        char operator;
        System.out.print("angka pertama: ");
        angka1 = up.nextInt();
        System.out.print("Operator: ");
        operator = up.next().charAt(0);
        System.out.print("angka kedua: ");
        angka2 = up.nextInt();
        
        switch (operator){
            case '+':
                hasil = angka1 + angka2;
                System.out.println("hasil: "+hasil);
            case '-':
                hasil = angka1 - angka2;
                System.out.println("hasil: "+hasil);
            case '*':
                hasil = angka1 * angka2;
                System.out.println("hasil: "+hasil);
            case '/':
                if (angka2 == 0) {
                    System.out.println("tdk bisa di bagi noll");
                }else{
                    hasil = angka1 / angka2;
                    System.out.println("hasil: "+hasil);
                }
            default:
                System.out.println("tdk ada operator");
        }
    }
}
