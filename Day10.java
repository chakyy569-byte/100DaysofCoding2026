 // Day10 menuju 100 Days of Coding
public class Day10 {
    
    public static void main(String[] args) {

        // ==========================================
        // DEKLARASI DAN INISIALISASI DATA CHARACTER
        // ==========================================
        String Name_Character = "Chakyy";
        byte   Level          = 50;
        short  Jumlah_Item    = 450;
        int    HP             = 1000;
        long   Gold           = 50000;
        char   Rank           = 'A';


        // ==========================================
        // BATAS MAKSIMAL TIPE DATA
        // ==========================================
        System.out.println("==========================================");
        System.out.println("       BATAS MAKSIMAL TIPE DATA");
        System.out.println("==========================================");
        System.out.println("Maks Byte    : " + Byte.MAX_VALUE);
        System.out.println("Maks Short   : " + Short.MAX_VALUE);
        System.out.println("Maks Int     : " + Integer.MAX_VALUE);
        System.out.println("Maks Long    : " + Long.MAX_VALUE);


        // ==========================================
        // STATUS AWAL CHARACTER
        // ==========================================
        System.out.println("\n==========================================");
        System.out.println("        STATUS AWAL MAIN CHARACTER");
        System.out.println("==========================================");
        System.out.println("Name Character : " + Name_Character);
        System.out.println("Level          : " + Level);
        System.out.println("Jumlah Item    : " + Jumlah_Item);
        System.out.println("Health Points  : " + HP);
        System.out.println("Gold           : " + Gold);
        System.out.println("Rank           : " + Rank);


        /*
         * ==========================================
         * CERITA:
         * Chakyy menjalankan sebuah misi berbahaya.
         * Setelah berhasil menyelesaikan misi tersebut,
         * Chakyy mendapatkan berbagai reward dan
         * akhirnya naik rank.
         * ==========================================
         */

        System.out.println("\n>>> MISSION START <<<");
        System.out.println(Name_Character + " sedang menjalankan misi...");
        System.out.println("Misi berhasil diselesaikan!");
        System.out.println("Chakyy mendapatkan beberapa reward!\n");


        // ==========================================
        // REWARD MISI / UPDATE VARIABLE
        // ==========================================
        Level += 10;
        Jumlah_Item += 50;
        HP += 500;
        Gold += 10000;
        Rank = 'S';


        // ==========================================
        // STATUS CHARACTER SETELAH MISI
        // ==========================================
        System.out.println("==========================================");
        System.out.println("       STATUS CHARACTER SETELAH MISI");
        System.out.println("==========================================");
        System.out.println("Name Character : " + Name_Character);
        System.out.println("Level          : " + Level);
        System.out.println("Jumlah Item    : " + Jumlah_Item);
        System.out.println("Health Points  : " + HP);
        System.out.println("Gold           : " + Gold);
        System.out.println("Rank           : " + Rank);
        System.out.println("==========================================");

        System.out.println("\n*** RANK UP BERHASIL! ***");
        System.out.println(Name_Character + " berhasil mencapai Rank " + Rank + "!");
        System.out.println("MISSION COMPLETE!");
    }
}

  
