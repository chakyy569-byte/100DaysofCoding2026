import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nama = new String[5];

        
        for (int a = 0; a < nama.length; a++) {
            System.out.print("Masukkan nama ke-" + (a + 1) + ": ");
            nama[a] = in.nextLine();
        }

        
        System.out.println("\nDaftar Nama:");

        for (int a = 0; a < nama.length; a++) {
            System.out.println(nama[a]);
        }
    
    }
    
}
