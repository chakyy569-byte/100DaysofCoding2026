package latihan;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int N = in.nextInt();
        int sum = 0;
        for (int a = 1; a <= N; a++){
            sum +=a;
            System.out.print(a + " ");
        }
        
        System.out.println();
        
        for (int a = N;a >= 1; a--){
            sum += a;
            
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(sum);
        // Good demn
    }
}
