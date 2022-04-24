package boxes;/*
 * 26/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to get comunity cards
 *
 */

public class ComuCardBox extends Box {

    public ComuCardBox(int idBox, String typeOfBox) {
        super(idBox, typeOfBox);
    }
    // Getters y setters


    // Método para definir la accion dependiendo del tipo de casilla
    public static String[] comu() {
        Reader r = new Reader("./src/aux/comuCard.txt");
        String[] fields = new String[2];
        int i = 0;
        int random = (int) ((Math.random() * 10) + 1);
        // r.readLine(); // Skip fields header
        String readEntry = r.readLine();
        while (i < random && r.readLine() != null) {
            fields = readEntry.split("-");
            i++;
            readEntry = r.readLine();
        }
        r.close();
        return fields;
    }

}


