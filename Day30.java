package latihan;

import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();   // nilainya 26
        int B = in.nextInt();   // nilainya 11
        int C = in.nextInt();   // nilainya 11
        int D = in.nextInt();   // nilainya 7

        System.out.println(A <= B); // hasilnya false
        System.out.println(A >= C); // hasilnya true
        System.out.println(B <= D); // hasilnya false
        System.out.println(B >= C); // hasilnya true
        System.out.println(C <= D); // hasilnya false
        System.out.println(C >= B); // hasilnya true


        //#Day 30 Menuju 100 Days Of Coding
        //#Chakyy_26


    }
}
