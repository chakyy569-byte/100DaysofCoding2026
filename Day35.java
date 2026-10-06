package latihan;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan kode tiket         :");
        int tiket = in.nextInt();
        System.out.print("Masukkan Umur               :");
        int umur = in.nextInt();
        System.out.print("Masukkan Saldo              :");
        int saldo = in.nextInt();

        int pemeriksaan = (tiket * umur) % 100;
        
        System.out.println("======================================");
        System.out.println("Nilai Pemeriksaan:" + pemeriksaan);

        if (pemeriksaan >= 20 && pemeriksaan <= 80) {
            if (umur < 17) {
                if (saldo >= 100000) {
                    System.out.println("Status Tiket: VALID");
                } else {
                    System.out.println("Status Tiket:TIDAK VALID");
                }
                
            } else {

            if (saldo >= 50000) {
                System.out.println("Status Tiket: VALID");
            } else {
                System.out.println("Status Tiket:Tidak VALID");
        }
    }
        } else {
            System.out.println("Status Tiket:Tidak VALID");
        }
        System.out.println("======================================");
    
        
    
    
    
    }
    
}
