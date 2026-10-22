package latihan;

import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System. in);

        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = in.nextInt();
        
        for (int t = 1;t <= tinggi;t++ ){
            for (int a =1;a <= t ;a++) {
                System.out.print(a+"");
                
            }
            System.out.println();
        }
    }
    
}
