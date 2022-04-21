package boxes;/*
 * 21/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to roll the dice
 *
 */

import misc.Player;

public class StartBox extends Box {

    public StartBox(int typeOfBox, String type) {
        super(typeOfBox, type);
    }


    public static void startCross(Player player) {
        player.receive(100);
        System.out.println("Recibes 100 por pasar por la casilla de salida! Cómprate algo bonito!");

    }
}
