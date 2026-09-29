import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();   // misal kan nilai nya 2
        int B = in.nextInt();   // misal kan nilai nya 2
        int C = in.nextInt();   // misal kan nilai nya 6

        System.out.println(A == B);     // hasil nya true
        System.out.println(B == C);     // hasil nya false
        System.out.println(A != B);     // hasil nya false
        System.out.println(C != A);     // hasil nya true

        // Day 28 Menuju 100 Days Of Coding
        // Chakyy
    }
}
