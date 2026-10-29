package latihan;

import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int a = N; a >= 1; a--){
            if (a % 2 != 0) {
                System.out.print(a + " ");
                
            } else {
                
            }
        }
        System.out.println();
        System.out.println("Angka ganjil");
        System.out.println("______________");
        for (int b = N; b >= 1; b--){
            if (b % 2 == 0) {
                System.out.print(b + " ");
                
            }

        }
        System.out.println();
        System.out.println("Angka genap");
    }
}
