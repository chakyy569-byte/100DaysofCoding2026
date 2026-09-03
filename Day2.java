/**
 * Day2menuju100DaysofCoding
 */
public class Day2coding {

    public static void main(String[] args) {

        // Biodata diri
        String nama = "Zaky";
        int umur = 18;
        String alamat = "Majene";
        String jurusan = "Teknik Informatika";
        double tinggi = 171.5;

        // Menggunakan println()
        System.out.println("=== BIODATA DIRI ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");

        // Menggunakan print()
        System.out.print("Alamat : ");
        System.out.print(alamat);
        System.out.println();

        System.out.print("Jurusan: ");
        System.out.print(jurusan);
        System.out.println();

        // Menggunakan printf()
        System.out.printf("Tinggi : %.1f cm%n", tinggi);
    }
}
