package latihan;
import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    
    int a = in.nextInt();
    int b = in.nextInt();
    char d = in.next().charAt(0);
    
     if (d == 'A') {
        System.out.println(a + b);
        
     } else if (d == 'B') {
        System.out.println(a - b);
        
     } else if (d == 'C') {
        System.out.println(a * b);
        
     } else if (d == 'D') {
        System.out.println(a / b);

        
     }
    
    
    }
    
}
