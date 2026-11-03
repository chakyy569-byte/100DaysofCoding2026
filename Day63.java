package latihan;
public class Day63 {
    public static void main(String[] args) {
        int M = 7;
        int N = 11;
        long pangkat = 1;
        for (int c = 1; c <= N; c++ ){
            pangkat*=M;

        }
        System.out.println(M + " Pangkat " + N + " Adalah " + pangkat);
    }
}
