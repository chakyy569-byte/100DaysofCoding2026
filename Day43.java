package latihan;

import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka    :");
        int angka = in.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Kelipatan 3 & kelipatan  5");
            
        } else if (angka % 3 == 0) {
            System.out.println("kelipatan 3 ");

            
        } else if (angka % 5 == 0) {
            System.out.println("kelipatan 5");
            
        } else if (angka % 3 != 0 && angka % 5 != 0) {
            System.out.println("Bukan kelipatan 3 & 5");
            
        }
    }

}
