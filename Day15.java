import java.util.Scanner;

public class Day15 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int jumlahbuku      = in.nextInt();
        int hargabuku       = in.nextInt();
        int jumlahorang     = in.nextInt();
        
        int totalharga      = jumlahbuku * hargabuku;
        int biayaperorang   = totalharga / jumlahorang;
        
        System.out.println("Jumlah buku         :" + jumlahbuku);
        System.out.println("Harga per buku      :Rp" + hargabuku);
        System.out.println("Total harga         :Rp" + totalharga);
        System.out.println("Jumlah orang        :" + jumlahorang);
        System.out.println("Biaya per orang     :Rp" + biayaperorang);
        
        
        //Day15Menuju100Daysofcoding
      //selamat hari badak sedunia 
    }
    
}
