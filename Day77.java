package latihan;
public class Day77 {
    public static void main(String[] args) {
        String KATA = "Adakah 100";
        String kata = "adakah 100";
        String KaTA = "  ADAKAH 100  ";
        
        System.out.println("Jumlah huruf/karakter  pada string pertama     : " + KATA.length());
        System.out.println("Huruf Kapital                                  : " + kata.toUpperCase());
        System.out.println("Huruf nonKapital                               : " + kata.toLowerCase());
        System.out.println("membandingkan dengan menilai besar/kecil huruf : "+KATA.equals(kata));
        System.out.println("Membandingkan tanpa menilai huruf nya          : " + KATA.equalsIgnoreCase(kata));
        System.out.println("apakah terdapat karakter yg Di cari ?          : "+ kata.contains("100"));
        System.out.println("apakah pada String pertama kosong ?            : "+ KATA.isEmpty());
        System.out.println("mengambil 3 karakter akhirr pada String kedua  : "+ kata.substring(7, 10));
        System.out.println("mengGanti 100 menjadi 50 pada String kedua     : "+ kata.replace("100", "50") );
        System.out.println("mengHapus Spasi pada String ketiga             : " + KaTA.trim());
        



    }
}
