package latihan;

import java.util.Scanner;

public class Day64{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int A = in.nextInt();

        long Faktorial = 1;

        for (int b = 1; b<=A; b++){
            Faktorial*=b;


        }
        System.out.println("Faktorial Dari " + A +" Adalah " + Faktorial );

    }
}
