    public class day9 {
        public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        int angka = 10000;         
        double pi = 3.14;       
        String ucapan = "Selamat 100days";  
        boolean status = true;  

        System.out.println("=====Nilai awal======");
        System.out.println("angka : " + angka);
        System.out.println("pi : " + pi);
        System.out.println("teks : " + ucapan);
        System.out.println("status : " + status);

        // Update variabel
        angka = 93290;          // Mengubah nilai integer
        pi = 3.1912;            // Mengubah nilai double
        ucapan = "World";       // Mengubah nilai string
        status = false;         // Mengubah nilai boolean

        System.out.println("\n====Setelah update====");
        System.out.println("angka : " + angka);
        System.out.println("pi : " + pi);
        System.out.println("teks : " + ucapan);
        System.out.println("status : " + status);
    }
}