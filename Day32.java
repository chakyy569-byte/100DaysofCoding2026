package latihan;

import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int A = in.nextInt(); // nilai nya 26
      
    // Mengkombinasikan operator perbandingan dan logika
    System.out.println(A <= 45 || 11 >= A && A == 7);       //hasilnya true
    System.out.println(A < 11 || A >= 67);                  //hasilnya false
    System.out.println(!(A <= 45 || 11 >= A && A == 7));    //hasi awalnya true tapi setelah di tambah (!) hasilnya jadi false
    System.out.println(A == 26 && A > 20 );                 //hasilnya true

    }
}
