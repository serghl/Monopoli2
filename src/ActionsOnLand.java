import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to define the actions at the start at the land on a box
 *
 */
public class ActionsOnLand {
    public static void land (Player player ,int pos) throws FileNotFoundException {
        Box landBox = ReadBoxBoard.getTypeOfBox(pos);
        Scanner s = new Scanner(System.in);
        int choice;
        // Check if we land on a PROPERTYBOX
        if (landBox instanceof PropertyBox) {
             // First of all check if does not have an owner
                 if (((PropertyBox) landBox).getPropietary().equals("null")) {
                     System.out.println("Has caido en " + ((PropertyBox) landBox).getName() + " y no tiene dueño");
                     System.out.println("Cuesta " +((PropertyBox) landBox).getPrice() + ", quieres comprarla?(1-Y / 0-N)");
                     choice = s.nextInt();
                     // Execute the buy, checking first if enough money for it
                     if (choice == 1 && player.getMoneyLeft() >= ((PropertyBox) landBox).getPrice() ) {
                         System.out.println(landBox);
                         // Pay , discount money from player
                         player.pay(((PropertyBox) landBox).getPrice());
                         // Add the property to his properties collection
                         player.add(landBox);
                         System.out.println("Tuya, añadida a tus propiedades!");
                         }
                     }
                 }

         }
    }

