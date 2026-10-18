package latihan;

import java.util.Scanner;

public class Day47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hari;
        System.out.println("=== Hari ===");
        System.out.println("1. Senin \n2. Selasa \n3. Rabu \n4. Kamis \n5. Jum'at \n6. Sabtu \n7. minggu");
        System.out.print("Pilih angka hari :");
        hari = in.nextInt();
         switch (hari) {
            case 1:
                System.out.println("Hari senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jum'at");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("Tidak Valid");
                break;
         }
    }
}
