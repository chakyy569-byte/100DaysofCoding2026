package latihan;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan angka :");
        int a = in. nextInt();
        String bilangan = (a % 2 != 0) ? "Ganjil" : "genap";
        System.out.println(a + " adalah bilangan " + bilangan);

    }
}
