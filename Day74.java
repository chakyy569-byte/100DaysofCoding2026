package latihan;
import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();

        System.out.println("Nama : " + nama);
        System.out.println("jumlah karakter : " + nama.length());
        System.out.println("Nama (Kapital) : " + nama.toUpperCase());
        System.out.println("Nama (Kecil) : " + nama.toLowerCase());
        




    }
}
