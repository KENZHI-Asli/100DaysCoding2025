import java.util.Scanner;
public class day39 {
    public static void main(String[] args) {
          Scanner hit = new Scanner(System.in);
          int angka1,angka2,hasil;
          char inti;
          System.out.println("Kalkulator");
          System.out.print("angka 1 : ");
          angka1 = hit.nextInt();
          System.out.print("operator : ");
          inti = hit.next().charAt(0);
          System.out.print("angka 2 : ");
          angka2 = hit.nextInt();
          if (inti == '+') {
            hasil = angka1+angka2;
              System.out.println("hasil : "+hasil);
        }else if (inti == '-') {
            hasil = angka1-angka2;
              System.out.println("hasil : "+hasil);                       
       }else if(inti == '*') {
        hasil = angka1*angka2;
        System.out.println("hasil : "+hasil);
        
       }else if (inti == '/') {
              if (angka2 != 0) {
                  hasil = angka1/angka2;
              System.out.println("hasil : "+hasil);
              }else{
                  System.out.println("Eror");
              }
          }else {
              System.out.println("operator tdk valid");
        } 
          hit.close();
    }
    
 
}

