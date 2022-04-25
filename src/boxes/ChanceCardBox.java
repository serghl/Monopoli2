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
    public static String[] chance()  {
        Reader r = new Reader("./src/aux/chanceCard.txt");
        String[] fields = new String[2];
        int i = 0;
        int random = (int) ((Math.random() * 9) + 1);
        String readEntry = r.readLine();
        while (i < random && r.readLine() != null) {
            i++;
            readEntry = r.readLine();
        }
        r.close();
        fields = readEntry.split("-");
        return fields;
    }
}

