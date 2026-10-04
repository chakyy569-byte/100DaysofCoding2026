package latihan;

import java.util.Scanner;

public class Day33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int total = in.nextInt(); // misal total belanjanya 150000

        if (total >= 100000) {      // kalo total belanjanya lebih dari 100000
            System.out.println("dapat diskon 10");  // berarti dapat diskon 
            int diskon = total * 10 / 100;
            total -= diskon;
            System.out.println("total akhir :"+ total);
        } else {     // kalo tidak lebih dari 100000
            System.out.println("tidak dapat diskon");   // maka tidak akan dapat diskon
        }
    }
}
    
       
