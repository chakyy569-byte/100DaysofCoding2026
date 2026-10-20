package latihan;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Umur :");
        int level = in.nextInt();
        String Stage = (level  >= 50) ? "Boleh lanjut" :  "Tidak boleh lanjut";
        System.out.println(Stage);
    }

}
