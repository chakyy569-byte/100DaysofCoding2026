package latihan;
import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int pilihan;
        int tusuk;
        int harga = 0;
        System.out.println("=== Pilih Menu ===");
        System.out.println("1. Sate ayam \n2. Sate kambing \n3. Sate sapi");
        System.out.print("Pilih     :");
        pilihan = in.nextInt();
       

        switch (pilihan) {
            case 1:
                System.out.print("Tusuk     :");
                tusuk = in.nextInt();
                System.out.println("Sate ayam  (Rp. 1000/tusuk) ");
                harga = 1000 * tusuk;
                System.out.println("=========================");
                System.out.println("total   :" + harga);
                break;
            case 2:
                System.out.print("Tusuk     :");
                tusuk = in.nextInt();
                System.out.println("Sate kambing  (Rp. 2000/tusuk");
                harga = 2000 * tusuk;
                System.out.println("=========================");
                System.out.println("total   :" + harga);
                break;
            case 3:
                System.out.print("Tusuk     :");
                tusuk = in.nextInt();
                System.out.println("Sate sapi  (Rp. 3000/tusuk)");
                harga = 3000 * tusuk;
                System.out.println("=========================");
                System.out.println("total   :" + harga);
                break;

            default:
                System.out.println("Pilihan Tidak Ada, Mohon Pilih Kembali!!");

            break;
        }
        
    }
}
