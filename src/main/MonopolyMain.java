package main;/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Method to read the .txt board file
 *
 */

import misc.NewGame;

import java.io.FileNotFoundException;
import java.util.Arrays;

import static boxes.ChanceCardBox.chance;

public class
MonopolyMain {

    public static void main(String[] args) throws FileNotFoundException {

        // misc.Player p1 = new misc.Player("Sergio",1500,0,false);

        // boxes.ReadBoxBoard b1 = new boxes.ReadBoxBoard();
        // boolean found = false;

        //boxes.ReadBoxBoard.readTxt();
        //while (!found) {
        //    misc.ActionsOnTurn.turn(p1);
        //}
        //System.out.println(Arrays.toString(chance()));
        NewGame.game();
    }
}