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
    public static void land(Player player, int pos) throws FileNotFoundException {
        Box landBox = ReadBoxBoard.getTypeOfBox(pos);
        Scanner s = new Scanner(System.in);
        int choice;
        // Options for a PROPERTYBOX
        if (landBox instanceof PropertyBox) {
            // First of all check if does not have an owner
            if (((PropertyBox) landBox).getPropietary().equals("null")) {
                System.out.println("Has caido en " + ((PropertyBox) landBox).getName() + " y no tiene dueño");
                System.out.println("Cuesta " + ((PropertyBox) landBox).getPrice() + ", quieres comprarla?(1-Y / 0-N)");
                choice = s.nextInt();
                // Execute the buy, checking first if enough money for it
                if (choice == 1 && player.getMoneyLeft() >= ((PropertyBox) landBox).getPrice()) {
                    System.out.println(landBox);
                    // Pay , discount money from player
                    player.pay(((PropertyBox) landBox).getPrice());
                    // Add the property to his properties collection
                    player.add(landBox);
                    // Change the property to Player's name
                    ((PropertyBox) landBox).setPropietary(player.getName());
                    System.out.println("Tuya, añadida a tus propiedades!");
                    // If not enough money
                } else if (choice == 1 && player.getMoneyLeft() < ((PropertyBox) landBox).getPrice()) {
                    System.out.println("No tienes suficiente dinero para esta propiedad!");
                    // If the property is owned by a player
                } else {
                    // Informar de quien es la propiedad
                    System.out.println("Has caido en " + ((PropertyBox) landBox).getName() + " y es propiedad de :"
                            + ((PropertyBox) landBox).getPropietary());
                }
            }
            // OPTIONS FOR A STATION
        } else if (landBox instanceof StationBox) {
            // First of all check if does not have an owner
            if (((StationBox) landBox).getPropietary().equals("null")) {
                System.out.println("Has caido en la estación de " + ((StationBox) landBox).getStationName() +
                        " y no tiene dueño");
                System.out.println("Cuesta " + ((StationBox) landBox).getPrice() + ", quieres comprarla?(1-Y / 0-N)");
                choice = s.nextInt();
                // Execute the buy, checking first if enough money for it
                if (choice == 1 && player.getMoneyLeft() >= ((StationBox) landBox).getPrice()) {
                    System.out.println(landBox);
                    // Pay , discount money from player
                    player.pay(((StationBox) landBox).getPrice());
                    // Add the property to his properties collection
                    player.add(landBox);
                    // Change the property to Player's name
                    ((StationBox) landBox).setPropietary(player.getName());
                    System.out.println("Tuya, añadida a tus propiedades!");
                }
                // If the property is owned by a player
            } else {
                // Informar de quien es la propiedad
                System.out.println("Has caido en " + ((StationBox) landBox).getStationName() + " y es propiedad de :"
                        + ((StationBox) landBox).getPropietary());
            }
            // OPTIONS FOR TAXBOX
            // TODO (esperando por el pot)
        } else if (landBox instanceof TaxBox) {
            if (((TaxBox) landBox).getTypeOfTax().equals("incomeTax")) {
                System.out.println("Has caido en Income Tax! Pagas 200!");
            } else if (((TaxBox) landBox).getTypeOfTax().equals("SuperTax")) {
                System.out.println("Has caido en Luxury Tax! Pagas 100!");
            } else if (((TaxBox) landBox).getTypeOfTax().equals("ParkingFree")) {
                System.out.println("Free Parking!! Te llevas el bote de :");
            }
        }
    }
}

