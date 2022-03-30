
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
                public static void turn(Player currPlayer) throws FileNotFoundException {
                        boolean found = false;
                        int choice;
                        // int choiceJail;
                        Scanner s = new Scanner(System.in);
                        System.out.println("\nEs tu turno " + currPlayer.getName() +"!");

                        // -------------------------
                        // Check if player is in Jail // TODO CHEQUEAR ESTE METODO DE JAIL
                        // --------------------------
                                /*
                                if (currPlayer.getTurnsJail() != 0) {
                                        System.out.println("Estás en la cárcel! Te quedan " + currPlayer.getTurnsJail() +
                                                " turnos para salir... " );
                                        System.out.println("Quieres pagar " + (currPlayer.getTurnsJail() * 100) + "para salir o" +
                                                "pasas turno ? (1- Pagar y salir / 2- PAsa turno)");
                                        Scanner s2 = new Scanner(System.in);
                                        choiceJail = s2.nextInt();
                                        switch(choiceJail) {
                                                case 1:
                                                        // Paga por los turnos restantes
                                                        currPlayer.pay(currPlayer.getTurnsJail() * 100);
                                                        // Pon a zero el contador de la carcel
                                                        currPlayer.setTurnsJail(0);
                                                        System.out.println("Sales de la cárcel despuès de pagar, pòrtate bien!");
                                                        break;
                                                case 2 :
                                                        // Resta un turno de los restantes y pasa al siguiente jugador
                                                        currPlayer.setTurnsJail(currPlayer.getTurnsJail()-1);
                                                        found = true;
                                                        break;
                                                default:
                                                        System.out.println("Elige una opcion válida por favor!");
                                                        found = false;
                                                        break;
                                        }
                                        */

                        while(!found) {
                                System.out.printf("\n Elige una opcion:\n 1 - Tira dados \n 2 - Lista de propiedades \n 3 - Info \n");
                                choice = s.nextInt();
                                switch(choice) {
                                        case 1:
                                                // TODO por que cojones me cambia la pos de todos? Tendra que ver con el bug de la asignacion de propiedades tambien??
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
                                                System.out.println("Te mueves a la casilla : " + newPos );
                                                ActionsOnLand.land(currPlayer, newPos);
                                                found = true;
                                                break;
                                        case 2:
                                                currPlayer.showProperties();
                                                found = false;
                                                break;
                                        case 3:
                                                System.out.println(currPlayer.toString());
                                                found = false;
                                                break;
                                                // TODO FALTARÁ LA OPCION DE CONSTRUIR?
                                        default:
                                                System.out.println("Elige una opcion válida por favor!");
                                                found = false;
                                                break;
                                }
                        }
                }
        }


