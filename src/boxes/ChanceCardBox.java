package boxes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 31/3/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to set up a player
 *
 */
public class ChanceCardBox extends Box {

    // Constructor
    public ChanceCardBox(int idBox, String typeOfBox) {
        super(idBox, typeOfBox);
    }

    // Método para leer el chance.TXT
// TODO MENEAR ESTO; HOY NO ME DA LA CABEZA
    public static String[] readChanceTxt() throws FileNotFoundException {
        String[][] chanceCards = new String[2][10];
        File file = new File("chanceCard.txt");
        Scanner schance = new Scanner(file);
        // Almacenamos los datos del .txt en un vector de Strings
        String chanceRow = schance.nextLine();
        String[] chanceData = chanceRow.split("-");
        String idChance = chanceData[0];
        String chanceCard = chanceData[1];

        return chanceCards[(int)((Math.random() * 10) + 1)];

    }
}
