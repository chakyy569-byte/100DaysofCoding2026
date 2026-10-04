package latihan;

import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String role = null;
        int pilihan;
        System.out.println("=== PILIH ROLE ===");
        System.out.println("1. Assasin \n2. Mage \n3. Marksman \n4. Fighter \n5. Support \n6. Tank");
        System.out.print("pilih role  :");
        pilihan = in.nextInt();

        if (pilihan == 1) {
            role = "Assasin";
  
        } else if (pilihan == 2){
            role = "Mage";

        } else if (pilihan == 3){
            role = "Marksman";

        } else if (pilihan == 4){
            role = "Fighter";

        } else if (pilihan == 5){
            role = "Support";

        } else if (pilihan == 6){
            role = "Tank";
        }
        if (role == null) {
            System.out.println("Pilihan tidak ada");
            
        } else {
            System.out.println("===================");
            System.out.println("Role yg di pilih");
            System.out.println(role);
        }

    }
}
