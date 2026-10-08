package latihan;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bilangan;
        
        System.out.print("Masukkan Bilangan   :");
        bilangan = in.nextInt();

        if (bilangan == 0) {
            String kode = "N";
            System.out.println(kode); 

        } else if (bilangan > 0 && bilangan % 2 == 0) {
            String kode = String.valueOf(bilangan);
            kode = "A";
           
            if (bilangan > 100) {
                kode = kode + "+";
                
            }
            System.out.println(kode);
        } else if (bilangan > 0 && bilangan % 2 != 0) {
            String kode = String.valueOf(bilangan);
            kode = "B";

            if (bilangan > 100) {
                kode = kode + "+";
                // bilangan positif ganjil genap batas
            }
            System.out.println(kode);
        } else if (bilangan < 0 && bilangan % 2 == 0) {
            String kode = String.valueOf(bilangan);
            kode = "C";
            
            if (bilangan < -100) {
                kode = kode + "-";
                
            }
            System.out.println(kode);
        } else if (bilangan < 0 && bilangan % 2 != 0) {
            String kode = String.valueOf(bilangan);
            kode = "D";

            if (bilangan < -100) {
                kode = kode + "-";
                
            }
            System.out.println(kode);
        }

    }
}
