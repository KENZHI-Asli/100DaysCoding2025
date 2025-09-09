public class Day2 {
    public static void main(String[] args) {
        
        //println() Menampilkan teks ke layar lalu pindah baris (newline).
        System.out.println("aco");
        System.out.println("arrafi");
        System.out.println(""); //pindah baris
        
        //print() Menampilkan teks ke layar tanpa pindah baris setelahnya
        System.out.print("aco");
        System.out.print("arrafi");
        System.out.println(""); //pindah baris
        
        //printf() Digunakan untuk menampilkan teks dengan format tertentu (formatting).
        //tipe data primitif
        int umur = 20;
        double nilai = 95.75;
         byte nilaibyte = 100;
        short jarakkota = 10000;
        long panjangtali = 1000000000;
        char inisial = 'A';
        float phi = 3.4000f;
        boolean benar = true;
        boolean salah = false;
        
        //tipe data non primitif
        String salam = "HAlO";
        System.out.printf("BILANG : %s %n", salam);
        
        System.out.printf("NILAI BYTE : %d %n", nilaibyte);
        System.out.printf("JARAK KOTA MEYLANE : %d %n", jarakkota);
        System.out.printf("PANJANG TALI SILAHTURAHMI : %d %n", panjangtali);
        System.out.printf("INISIAL SI PALING RAHASIA : %c %n", inisial);
        System.out.printf("phi saja : %.2f %n", phi);
        System.out.printf("MUNDUR : %b %n", benar);
        System.out.printf("MAJU : %b %n", salah);
        System.out.printf("Umur saya %d tahun%n", umur);
        System.out.printf("Nilai saya adalah %.2f%n", nilai);
        
    }
}

