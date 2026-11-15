package latihan;

import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();

        System.out.print("Masukkan Nama Perbandingan : ");
        String perbandingan = in.nextLine();

        System.out.println("Apa kah sama antara keduanya  ? : " + nama.equals(perbandingan));

        System.out.println("apa kah kata/nama nya sama ? :  " + nama.equalsIgnoreCase(perbandingan));

        System.out.print("Masukkan kata/huruf yg ingin di cari : ");
        String kata = in.nextLine();

        System.out.println("apa kah nama ini mengandung kata/huruf yg di cari? : " + nama.contains(kata));

        System.out.println("apakah namanya kosong ? : " +nama.isEmpty());

    }
}
