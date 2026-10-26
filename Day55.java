package latihan;

import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int a = in.nextInt();

        System.out.println("\n=== CONTINUE ===");
        contohContinue(a);

        System.out.println("\n=== BREAK ===");
        contohBreak(a);

        System.out.println("\n=== RETURN ===");
        contohReturn();

        System.out.println("Program Selesai");
        in.close();
    }

    static void contohContinue(int a) {
        for (int b = 1; b <= a; b++) {
            if (b == 7) {
                continue;
            }
            System.out.print(b + " ");
        }
    }

    static void contohBreak(int a) {
        for (int b = 1; b <= a; b++) {
            if (b == 11) {
                break;
            }
            System.out.print(b + " ");
        }
    }

    static void contohReturn() {
        for (int b = 1; b <= 5; b++) {
            if (b == 3) {
                return;
            }
            System.out.print(b + " ");
            System.out.println();
        }
        System.out.println("Baris ini tidak dijalankan.");
    }
}
