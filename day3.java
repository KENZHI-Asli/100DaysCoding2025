public class day3 {
    public static void main(String[] args) {       
        String nama = "Aco Arrafi";  
        int umur = 20;         
        // println -> cetak lalu pindah baris
        System.out.println("Nama " + nama);
        System.out.println("Umur " + umur);

        // print -> cetak tanpa pindah baris
        System.out.print("Meylane ");
        System.out.print("Ku");
        System.out.println(); 
        /* 
          printf -> cetak dengan format
          %s untuk String
          %d untuk integer
          %n pindah baris
         */
        
        // komentar satu baris -> // 
        // komentar banyak baris -> /*...*/
        System.out.printf("Nama %s Umur %d tahun %n", nama, umur);
    }
}