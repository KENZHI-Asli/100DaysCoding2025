public class day7 {
    public static void main(String[] args) {
        char huruf = 'A';
        char angka = '7'; //char cuma bisa di isi 1 teks atau angka intinya 1

        boolean Benar = true;
        boolean Salah = false;
        boolean Random;
        
        int number = 11;
        Random = (number % 2 == 0); // true jika genap, ganjil false
        
        System.out.println("Huruf: " + huruf);
        System.out.println("Simbol: " + angka);

        System.out.println("Apakah Java menyenangkan? " + Benar);
        System.out.println("Apa kamu suka saya? " + Salah);
        System.out.println("Apakah " + number + " genap? " + Random);
        
    }
}