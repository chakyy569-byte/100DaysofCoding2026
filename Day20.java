import java.util.Scanner;

public class Day20 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n=== Masukkan Data ===");
        
        System.out.print("NIM               :");
        int nim = in.nextInt();
        
        System.out.print("Umur              :");
        int umur = in.nextInt();
        
        System.out.print("Tinggi badan      :");
        double tb = in.nextDouble();
        
        
        String nimString  = String.valueOf(nim);
        String umurString = Integer.toString(umur);
        String tbString   = tb + "";
        
        String penggabungan = umurString + tbString;
        
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("NIM                     : " + nimString);
        System.out.println("Umur                    : " + umurString + " tahun");
        System.out.println("Tinggi Badan            : " + tbString + " cm");
        System.out.println("Gabungan umur dan tb    : " + penggabungan);
        
        
        
    }
    
}
