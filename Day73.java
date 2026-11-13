package latihan;

import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int penjumlahan;
        int total = 0;

        while (true) {
            System.out.print("Masukkan angka : ");
            penjumlahan = in.nextInt();

            if (penjumlahan < 0) {
                break;
                
            }
            total+=penjumlahan;
        }
        System.out.println("total :" + total);
        
    }
    
}
