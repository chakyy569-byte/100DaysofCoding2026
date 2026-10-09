package latihan;

import java.util.Scanner;

public class Day38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String menu = null;
        int pilihan;
        int porsi;
        int harga = 0;
        System.out.println("===== Selamat Datang di Warung Pesisir =====");
        System.out.println("    ===== Silahkan PILih Menunya =====");
        System.out.println("1. NasGor \t\t Rp. 12000 \n2. Bakso \t\t Rp. 10000 \n3. bakmie \t\t Rp. 10000 \n4. Mie Ahyang \t\t Rp. 12000 \n5. Soto Ahyang \t\t Rp. 10000 ");
        System.out.println("==================================");
        System.out.print("Pilih menu        :");
        pilihan = in.nextInt();
        
        if (pilihan == 1) {
            menu = "NasGor | Rp. 12000/porsi";
            harga =  12000;
            
        } else if (pilihan == 2) {
            menu = "Bakso | Rp. 10000/porsi";
            harga =  10000;
            
        } else if (pilihan == 3) {
            menu = "Bakmie | Rp. 10000/porsi";
            harga = 10000;
            
        } else if (pilihan == 4) {
            menu = "Mie Ahyang | Rp. 12000/porsi";
            harga = 12000;
            
        } else if (pilihan == 5) {
            menu = "Soto Ahyang | Rp. 10000/porsi";
            harga =  10000;
            
        }
        if (menu == null) {
            System.out.println("Pilihan Menu TIdak Ada");
            
        } else {
            System.out.print("Berapa Porsi      :");
            porsi = in.nextInt(); 

            harga = harga * porsi;


            System.out.println("==================================");
            System.out.println("======= Menu yang Di pilih =======");
            System.out.println(menu);
            System.out.println("Total   Rp. :"+ harga);
            System.out.println("==================================");
        }

            
            
        
        

    }
    
}
