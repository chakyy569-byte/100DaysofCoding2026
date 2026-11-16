package latihan;

import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Masukkan Nama :  ");
        String nama = in.nextLine();

        System.out.println(nama.substring(0, 5));

        String kalimat = "Good game";
        System.out.println("Sebelum : " + kalimat);
        String kata = kalimat.replace("game", "joob");
        System.out.println("Sesudah : "+kata);

        String contoh = "  yoo whats'up gank  ";

        System.out.println("sebelmu : (" + contoh + ")");
        System.out.println("sesudah : (" + contoh.trim() + ")");

    }
}
