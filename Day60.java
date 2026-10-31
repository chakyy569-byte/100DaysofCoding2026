package latihan;

import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int sum = 0;
        for (int a = 1; a <= N; a++){
            sum+=a;
            System.out.print(a + " ");
            
        }
        System.out.println();
        System.out.println(sum);
    }

}
