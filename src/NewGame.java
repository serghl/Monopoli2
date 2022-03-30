import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.util.Arrays;
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

    // Arrancamos el bote

    static int pot = 0;

    // Getters y setters del pot

    public static int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    // Methods to agree and clear the pot

    static void addPot(int money) {
        pot += money;
    }

    public static void resetPot() {
        pot = 0;
    }

    // Metodo Para Arrancar el Juego

    public static void game() throws FileNotFoundException {
        boolean endGame = false;
        // Arrancamos el tablero
        ReadBoxBoard b1 = new ReadBoxBoard();
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println("--- BIENVENID@S AL MONOPOLY ---");
        System.out.println("-------------------------------\n\n");
        System.out.println("CUÁNT@S JUGADOR@S SERÉIS? (MIN2 - MAX4)");
        // Creamos el array de jugadores
        Player[] arrayPlayers = new Player[sc.nextInt()];
        for (int i = 1; i < arrayPlayers.length + 1; i++) {
            Scanner str = new Scanner(System.in);
            System.out.println("NOMBRE DEL/LA JUGADOR/A " + i + "?");
            String nom = str.nextLine();
            arrayPlayers[i - 1] = new Player(nom, 1500, 0);
        }
        System.out.println("-------------------------------");
        System.out.println("-- EMPEZAMOS, BUENA SUERTE! ---");
        System.out.println("-------------------------------\n\n");

        /*
        --------------------------------------------------------
        ---------------- SISTEMA DE TURNOS ---------------------
        --------------------------------------------------------
         */
        int turnCounter = 1;
        while (!endGame) {
            System.out.println("TURNO - " + turnCounter + " BOTE : " +getPot());
            for (int i = 0; i < arrayPlayers.length; i++) {
                    ActionsOnTurn.turn(arrayPlayers[i]);
            }
            turnCounter++;
        }
    }


}

