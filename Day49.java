package latihan;

import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Umur :");
        int level = in.nextInt();
        String Status = (level  >= 50) ? "Boleh masuk" :  "Tidak boleh masuk";
        System.out.println(Status);
    }

}
