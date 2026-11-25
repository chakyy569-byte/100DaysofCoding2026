import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = new int[5];

        for (int a = 0; a < angka.length; a++) {
            System.out.print("Masukkan angka ke-" + (a + 1) + ": ");
            angka[a] = in.nextInt();
        }

        int minimal = angka[0];

        for (int a = 0; a < angka.length; a++) {
            if (angka[a] < minimal) {
                minimal = angka[a];
            }
        }

        System.out.println("Angka minimal: " + minimal);
    }
}
