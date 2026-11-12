package latihan;

import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Mie Ayam Kekalahan ");
            System.out.println("2. Mie Ayam Kemenangan");
            System.out.println("3. Es Teh Kejujuran");
            System.out.println("4. Back");
            System.out.println("=========================");
            System.out.print("Pilih Menu : ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Mie Ayam Kekalahan");
                    
                    break;
                case 2:
                    System.out.println("Mie Ayam Kemenangan");
                    break;
                case 3:
                    System.out.println("Es Teh Kejujuran");
                    break;
            
                default:
                    System.out.println("Salah woyy, Pilih ulang!!");
                    break;
            }
        } while (menu != 4); 
        
    }
    
}
