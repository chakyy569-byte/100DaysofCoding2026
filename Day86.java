
package latihan;

import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] pokemon = {
            "Pikachu", "Charmander", "Bulbasaur",
            "Squirtle", "Eevee"
        };

        System.out.print("Masukkan nama Pokemon: ");
        String cari = in.nextLine();

        boolean ditemukan = false;

        for (int a = 0; a < pokemon.length; a++) {
            if (pokemon[a].equalsIgnoreCase(cari)) {
                System.out.println("Pokemon ditemukan!");
                System.out.println("Nama: " + pokemon[a]);
                System.out.println("Indeks: " + a);

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Pokemon tidak ditemukan!");
        }

        
    }
}
