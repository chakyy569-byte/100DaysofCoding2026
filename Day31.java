package latihan;

import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int A = in.nextInt();   // misal nilainya 26
    int B = in.nextInt();   // misal nilainya 11
    int C = in.nextInt();   // misal nilainya 7
    boolean D = true;
    boolean F = false;

    // Penggunaan && (And) Dan
    System.out.println(A <= C && A >= B);       // hasilnya false
    System.out.println(C <= B && B <= 11);      // hasilnya true
    
    // Penggunaan || (Or) Atau
    System.out.println(B <= C || A >= B);       // hasilnya true
    System.out.println(C >= B || A <= 10);      // hasilnya false

    //penggunaan ! (Not) Tidak
    System.out.println(!(B <= C || A >= B));    // hasilnya menjadi false
    System.out.println(!(C >= B || A <= 10));   // hasilnya menjadi true
    //bentuk pada boolean
    System.out.println(!D); // hasilnya menjadi false
    System.out.println(!F); // hasilnya menjadi true


    // #Day31 Menuju 100Days Of Coding
    // #Chakyy_26
    
        
    }
    
}
