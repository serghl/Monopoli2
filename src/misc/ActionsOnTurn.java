package misc;

import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 24/2/2
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to define the actions at the start of the turn
 *
 */
public class ActionsOnTurn {

    public static void turn(@NotNull Player currPlayer) throws FileNotFoundException {
        boolean found = false;
        int choice;
        // int choiceJail;
        Scanner s = new Scanner(System.in);
        System.out.println("\nEs tu turno " + currPlayer.getName() + "!");

        // -------------------------
        // Check if player is in Jail //
        // --------------------------

        if (currPlayer.getTurnsJail() > 0) {
            found = isInJail(currPlayer);
        }
        while (!found) {
            System.out.print("\n Elige una opcion:\n 1 - Tira dados \n 2 - Lista de propiedades \n 3 - Info \n");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    int roll = Dice.rollDice();
                    System.out.println("Has sacado un : " + roll);
                    int newPos = currPlayer.getPos() + roll;
                    // Esto para dar la vuelta al tablero
                    if (newPos > 39) {
                        newPos = currPlayer.getPos() + roll - 40;
                        System.out.println("Pasas por la casilla de salida, recibes 200!");
                        currPlayer.receive(200);
                    }
                    currPlayer.setPos(newPos);
                    System.out.println("Te mueves a la casilla : " + newPos);
                    ActionsOnLand.land(currPlayer, newPos);
                    found = true;
                    break;
                case 2:
                    currPlayer.showProperties();
                    break;
                case 3:
                    System.out.println(currPlayer);
                    break;
                // TODO FALTARÁ LA OPCION DE CONSTRUIR?
                default:
                    System.out.println("Elige una opción válida por favor!");
                    break;
            }
        }
    }

    public static boolean isInJail(Player currPlayer) {
        System.out.println("Estás en la cárcel! Te quedan " + currPlayer.getTurnsJail() +
                " turnos para salir... ");
        // Chequear si el jugador tiene cartas de librarse de la carcel
        if (currPlayer.getFreeJailCard() > 0) {
            System.out.println("Tienes " + currPlayer.getFreeJailCard() + " cartas para librarte de la carcel," +
                    "quieres usar una? (1- Sí / 2- No)");
            Scanner s1 = new Scanner(System.in);
            int useCard = s1.nextInt();
            if (useCard == 1) {
                currPlayer.setFreeJailCard(currPlayer.getFreeJailCard() - 1);
                currPlayer.setTurnsJail(0);
                System.out.println("Sales de la cárcel despuès de pagar la multa, pòrtate bien!");
                return false;
            }
        } else {
            System.out.println("Quieres pagar " + (currPlayer.getTurnsJail() * 100) + "para salir o" +
                    "pasas turno ? (1- Pagar y salir / 2- Pasa turno)");
            Scanner s2 = new Scanner(System.in);
            int choiceJail = s2.nextInt();
            switch (choiceJail) {
                case 1:
                    // Paga por los turnos restantes
                    currPlayer.pay(currPlayer.getTurnsJail() * 100);
                    // Pon a zero el contador de la carcel
                    currPlayer.setTurnsJail(0);
                    System.out.println("Sales de la cárcel despuès de pagar la multa, pòrtate bien!");
                    return false;
                case 2:
                    // Resta un turno de los restantes y pasa al siguiente jugador
                    currPlayer.setTurnsJail(currPlayer.getTurnsJail() - 1);
                    return true;
                default:
                    System.out.println("Elige una opcion válida por favor!");
                    break;
            }
        }
        return false;
    }
}





