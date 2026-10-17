package latihan;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int pilihan;
        System.out.println("=== Menu Dapur Mandar ===");
        System.out.println("1. Jepa \n2. Bau Peapi \n3. Sokkol  \n4. Bau Pais \n5. Bau Tunu");
        System.out.println("=========================");
        System.out.print("Pilih Menu Anda   : ");
        pilihan = in.nextInt();
        System.out.println("=========================");
        switch (pilihan) {
            case 1:
                System.out.println("Pesanan dipilih :");
                System.out.println("Jepa");
                System.out.println("=========================");
                System.out.println("Pesanan Di Proses");
                System.out.println("Mohon Di Tunggu");
                break;
            case 2:
                System.out.println("Pesanan dipilih :");
                System.out.println("Bau Peapi");
                System.out.println("=========================");
                System.out.println("Pesanan Di Proses");
                 System.out.println("Mohon Di Tunggu");
                break;
            case 3:
                System.out.println("Pesanan dipilih :");
                System.out.println("Sokkol");
                System.out.println("=========================");
                System.out.println("Pesanan Di Proses");
                 System.out.println("Mohon Di Tunggu");
                break;
            case 4:
                System.out.println("Pesanan dipilih :");
                System.out.println("Bau Pais");
                System.out.println("=========================");
                System.out.println("Pesanan Di Proses");
                 System.out.println("Mohon Di Tunggu");
                break;
            case 5:
                System.out.println("Pesanan dipilih :");
                System.out.println("Bau Tunu");
                System.out.println("=========================");
                System.out.println("Pesanan Di Proses");
                 System.out.println("Mohon Di Tunggu");
                break;

            default:
                System.out.println("Pilihan Salah/Tidak Valid");
                System.out.println("Mohon pilih Kembali");
                break;
        }
    }
    
}
