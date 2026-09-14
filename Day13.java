import java.util.Scanner;

public class soalw {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nama              :");
        String nama = in.nextLine();
        
        System.out.print("Nim               :");
        String nim = in.nextLine();
        
        System.out.print("Tinggi Badan      :");
        double tinggi = in.nextDouble();
        
        System.out.print("Berat Badan       :");
        double berat = in.nextDouble();
        
        System.out.print("Status Mahasiswa  :");
        boolean status = in.nextBoolean();
        
        System.out.printf("Nama\t\t\t:%s%nNim\t\t\t:%s%nTinggi Badan\t\t:%.2fcm %nBerat Badan\t\t:%.2fkg %nStatus Mahasiswa\t:%b ", nama, nim, tinggi, berat, status );
    }
    
}
