package latihan;

import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        System.out.println("Kelipatan " + M + " Dari 1 Sampai " + N + " Adalah ");
        for (int a = M;a <= N; a += M){
            System.out.print(a + " ");

        }
    }
}
