package latihan;

public class Day66 {
    public static void main(String[] args) {
        for (int a = 0; a < 10 / 2; a++){
            for (int z = 0; z < 10; z++){
                if ((a + z) % 2 == 0){
                    System.out.print("O ");
                }else{
                    System.out.print("# ");
                }
                
            }
        System.out.println();
        }
    }
}
