import java.util.Scanner;

/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Method to read the .txt board file
 *
 */
public class NewGame {
    public static void game() {
        ReadBoxBoard b1 = new ReadBoxBoard();
        int nPlayers = 0;
        int pot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("--- BIENVENIDOS AL MONOPOLY ---");
        System.out.println("-------------------------------\n\n");
        System.out.println("CUANTOS JUGADORES SERÉIS? (MIN2 - MAX4)");
        nPlayers = sc.nextInt();
        for (int i = 1; i < nPlayers; i++) {
            System.out.println("NOMBRE DEL JUGADOR " + i + "??");
            // TODO (chequear por que no me tira el "reconocedor de nombres" Problemas con el buffer?)
            // Chequear por que no pilla los nombres??
            String nom = sc.nextLine();
            Player p = new Player(nom, 1500, 0, false);
            System.out.println(p.getName());
        }
    }
}

