package latihan;

import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int c = in.nextInt();
        for (int a = 1; a <= c; a++ ){
            for (int b = a; b <= c; b++){
                System.out.print("@ ");

            }
            System.out.println();
        }
        
    }
    
}
