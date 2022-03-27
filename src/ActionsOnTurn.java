import javax.sound.midi.Soundbank;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.ibm.jvm.dtfjview.Version.getName;

/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to define the actions at the start of the turn
 *
 */
public class ActionsOnTurn {
                public static void turn(Player player) throws FileNotFoundException {
                        boolean found = false;
                        int choice;
                        Scanner s = new Scanner(System.in);
                        System.out.println("Es tu turno " + player.getName() +"!");

                        while(!found) {
                                System.out.printf("\n Elige una opcion:\n 1 - Tira dados \n 2 - Lista de propiedades \n 3 - Info \n");
                                choice = s.nextInt();
                                switch(choice) {
                                        case 1:
                                                int roll = Dice.rollDice();
                                                System.out.println("Has sacado un : " + roll );
                                                int newPos = player.getPos() + roll;
                                                // Esto para dar la vuelta al tablero??
                                                if (newPos > 39) {
                                                        newPos = player.getPos() + roll - 40;
                                                        System.out.println("Pasas por la casilla de salida, recibes 200!");
                                                        player.receive(200);
                                                }
                                                System.out.println("Te mueves a la casilla : " + newPos );
                                                player.setPos(newPos);
                                                ActionsOnLand.land(player, newPos);
                                                found = true;
                                                break;
                                        case 2:
                                                player.showProperties();
                                                found = false;
                                                break;
                                        case 3:
                                                System.out.println(player.toString());
                                                found = false;
                                                break;
                                        default:
                                                System.out.println("Elige una opcion válida por favor!");
                                                found = false;
                                                break;
                                }
                        }
                }
        }

