package latihan;
import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

       int angka1,angka2;
       System.out.print("Masukkan angka 1   :");
       angka1 = in.nextInt();
       System.out.print("Masukkan angka 2   :");
       angka2 = in.nextInt();
       int menu;
       do {
            System.out.println("Daftar menu: \n1. penjumlahan \n2. perkalian \n3. pengurangan \n4. berhenti ");
            System.out.print("pilihan :");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Hasil penjumlahan = " + (angka1 + angka2));
                    break;
                case 2:
                    System.out.println("Hasil perkalian = " + (angka1 * angka2));
                    break;
                case 3:
                    System.out.println("Hasil pengurangan = "+ (angka1 - angka2));
                    break;
                case 4:
                    return;
            
                
            }

        } while ( menu <= 4);

    }
    
}
