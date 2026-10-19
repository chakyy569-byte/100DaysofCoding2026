package latihan;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan angka    :");
        int a = in.nextInt();
        System.out.print("Pilih operator (+ - * /) :");
        char operator = in.next().charAt(0);
        System.out.print("masukkan angka    :");
        int b = in.nextInt();

        switch (operator) {
            case '+':
                System.out.println("Hasil nya adalah :"+ (a+b));
                
                break;
            case '-':
                System.out.println("Hasil nya adalah :" + (a-b));
                break;
            case '*':
                System.out.println("Hasil nya adalah :" + (a*b));
                
                break;
            case '/':
                System.out.println("Hasil nya adalah :" + (a/b));
                break;
            default:
                System.out.println("TIDAK VALID!!");
                break;
        
        }





    }
}
