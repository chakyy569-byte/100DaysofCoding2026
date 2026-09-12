import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama          :");
        String Nama = input.nextLine();
        
        System.out.print("Umur          :");
        int Umur = input.nextInt();
        
        System.out.print("Tinggi Badan  :");
        double tinggibadan = input.nextDouble();
        
        System.out.print("Jenis Kelamin :");
        char jeniskelamin = input.next().charAt(0);
        
        System.out.println("\n=== BIODATA ===");
        
        System.out.printf("Nama\t\t: %s%n", Nama);
        System.out.printf("Umur\t\t: %d tahun%n", Umur);
        System.out.printf("Tinggi\t\t: %.2f cm%n", tinggibadan);
        System.out.printf("Jenis Kelamin\t: %c%n", jeniskelamin);
	
    }
}
