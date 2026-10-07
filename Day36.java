package latihan;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int angka;
        System.out.println("======================================================");
        System.out.println(" || PROGRAM MENENTUKAN BILANGAN GANJIL ATAU  GENAP ||");
        System.out.println("======================================================");
        System.out.print("Masukkan Angka    :");
        angka = in.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " ADALAH BILANGAN GENAP ");
            
        } else {
            System.out.println(angka + " ADALAH BILANGAN GANJIL");
        }

    }
    
}
