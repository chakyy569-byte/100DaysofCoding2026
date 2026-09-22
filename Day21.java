import java.util.Scanner;

public class Day21 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // input
        System.out.print("Nama                    :");
        String namaString = in.nextLine();
        
        System.out.print("Umur                    :");
        String umurString = in.nextLine();
        
        System.out.print("Tinggi Badan            :");
        String tbString = in.nextLine();
        
        System.out.print("Berat Badan             :");
        String bbString = in.nextLine();
        
        System.out.print("Semester                :");
        String semesterString = in.nextLine();
        
        System.out.print("IPK                     :");
        String ipkString = in.nextLine();
          
        System.out.print("NIM                     :");
        String nimString = in.nextLine();
        
        System.out.print("Jumlah Penghargaan      :");
        String penghargaanString = in.nextLine();
        
        System.out.print("Kode Kelas              :");
        String kelasString = in.nextLine();
        
        /*
         * Masuk ke topik utama yaitu mengubah 
         * tipe data (String) ke tipe data primitif
         */
        
        int umur = Integer.parseInt(umurString);
        
        double tb = Double.parseDouble(tbString);
        
        double bb = Double.parseDouble(bbString);
        
        short semester = Short.parseShort(semesterString);
        
        double ipk = Double.parseDouble(ipkString);
        
        long nim = Long.parseLong(nimString);
        
        byte penghargaan = Byte.parseByte(penghargaanString);
        
        char kelas = kelasString.charAt(0);
        
        // perhitungan
        int tahun_lahir = 2026 - umur;
        int totalpoint = (penghargaan * 10) + (semester * 5);
        double tinggi_dalam_meter = tb / 100;
        
        // inisial nama 
        char inisial = namaString.charAt(0);
        
        // output
        System.out.println("\n=== DATA ANGGOTA UKM MULTIMEDIA ===");
        System.out.println("Nama                 : " + namaString + " (Inisial: " + inisial + ")");
        System.out.println("Umur                 : " + umur + " tahun, Perkiraan Lahir: " + tahun_lahir);
        System.out.println("Tinggi               : " + tb + " cm (" + tinggi_dalam_meter + " m), Berat: " + bb + " kg");
        System.out.println("Semester             : " + semester + ", IPK: " + ipk + ", NIM: " + nim);
        System.out.println("Kode Kelas           : " + kelas + ", Jumlah Penghargaan: " + penghargaan);
        System.out.println("Total Poin Prestasi  : " + totalpoint);
        
        
        // capek nyoo banyak tugas :)
        // #Day21Menuju100DaysOfCoding
        // haaahhahahaa
        
    }
    
}
