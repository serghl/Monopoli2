/*
 * 21/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to roll the dice
 *
 */

public class StartBox extends Box {
<<<<<<< HEAD


    public StartBox(int typeOfBox, String type) {
        super(typeOfBox, type);
=======
    public StartBox(int idBox, String typeOfBox) {
        super(idBox, typeOfBox);
>>>>>>> origin/main
    }

    public static void startCross(Player player) {
        player.receive(100);
        System.out.println("Recibes 100 por pasar por la casilla de salida! Cómprate algo bonito!");

    }
}
