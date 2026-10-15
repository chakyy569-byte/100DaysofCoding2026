package latihan;

import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int pilihan;
        System.out.println("=== Pilih Pket ===");
        System.out.println("1. paket 1 + nasi");
        System.out.println("2. Paket 2 + esteh + nasi");
        System.out.print("Pilih     :");
        pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Paket 1 + nasi");
                break;
        
            case 2 :
                System.out.println("Paket 2 + Esteh + Nasi");
                break;
            default :
                System.out.println("Pilihan salah/Harap Pilih kembali");
                break;
        }
    }
}
