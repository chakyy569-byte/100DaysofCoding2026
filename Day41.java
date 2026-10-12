package latihan;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Suhu Ruangan             :");
        int suhu = in.nextInt();
        System.out.print("masukkan kelembapan Ruangan       :");
        int kelembapan;
        kelembapan = in.nextInt();

        if (suhu >= 18 && suhu <= 28 && kelembapan >= 40 && kelembapan <= 60) {
            System.out.println("Ruangan Nyaman");

            
        } else if (suhu < 18 || kelembapan < 40) {
            System.out.println("Suhu atau kelembapan Terlalu Rendah");
            
        } else if (suhu > 28 || kelembapan > 60) {
            System.out.println("Suhu atau kelembapan Terlalu Tinggi");
            
        }

    }
    
}
