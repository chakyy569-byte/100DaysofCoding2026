import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = {10, 20, 30, 40, 50};

        System.out.println("Data awal:");
        for (int a = 0; a < angka.length; a++) {
            System.out.print(angka[a] + " ");
        }

        System.out.print("\nMasukkan indeks yang ingin diubah: ");
        int indeks = in.nextInt();

        System.out.print("Masukkan angka baru: ");
        int nilai = in.nextInt();

        if (indeks >= 0 && indeks < angka.length) {
            angka[indeks] = nilai;
        } else {
            System.out.println("Indeks tidak valid!");
        }

        System.out.println("\nData setelah dimanipulasi:");
        for (int a = 0; a < angka.length; a++) {
            System.out.print(angka[a] + " ");
        }

        
    }
}
