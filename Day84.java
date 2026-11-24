import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = new int[5];

        for (int a = 0; a < angka.length; a++) {
            System.out.print("Masukkan angka ke-" + (a + 1) + ": ");
            angka[a] = in.nextInt();
        }

        int maksimal = angka[0];

        for (int a = 1; a < angka.length; a++) {
            if (angka[a] > maksimal) {
                maksimal = angka[a];
            }
        }

        System.out.println("Angka maksimal dalam array: " + maksimal);

      
    }
}
