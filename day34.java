public class day34 {
    public static void main(String[] args) {
        int ayam = 20;
        int sapi = 40;
        int kambing = 28;
        System.out.println("sapi lebih banyak dari kambing dan ayam lebih banyak dari sapi true or false? "+(sapi > kambing && ayam > sapi));
        System.out.println("\nApakah sapi minimal sama dengan 30 dan ayam tidak lebih dari 25 true or false? "+ (sapi >= 30 && ayam <= 25));
    }
}
