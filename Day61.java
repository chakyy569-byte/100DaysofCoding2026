package latihan;

import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = 1;
        for (int O = 1; O <= N; O++){
            M*=O;
            System.out.print(O+" ");

        }
        System.out.println();
        System.out.println(M);
    }
}
