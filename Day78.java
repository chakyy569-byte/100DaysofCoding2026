package latihan;

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        String usernameAkun = "Chakyy26";
        String passwordAkun = "GTA52026";

        System.out.println("===== BUAT AKUN GTA 5 =====");

        System.out.print("Buat Username : ");
        usernameAkun = in.nextLine();

        System.out.print("Buat Password : ");
        passwordAkun = in.nextLine();

        System.out.println("\n===== LOGIN GTA 5 =====");

        String username;
        String password;

        while (true) {
            System.out.print("Username : ");
            username = in.nextLine();

            System.out.print("Password : ");
            password = in.nextLine();

            if (username.equals(usernameAkun) &&
                password.equals(passwordAkun)) {

                System.out.println("\nLogin Berhasil!");
                System.out.println("Selamat Datang di GTA 5!");
                break;

            } else {
                System.out.println("\nUsername atau Password Salah!");
                System.out.println("Silakan Login Kembali.\n");
            }
        }

        in.close();
    }
}

