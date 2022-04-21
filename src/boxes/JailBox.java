package boxes;/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Method to read the .txt board file
 *
 */

import boxes.Box;

public class JailBox extends Box {
    String typeOfJail;

    // Constructor
    public JailBox(int idBox, String typeOfBox, String typeOfJail) {
        super(idBox, typeOfBox);
        this.typeOfJail = typeOfJail;
    }

    public String getTypeOfJail() {
        return typeOfJail;
    }

    public void setTypeOfJail(String typeOfJail) {
        this.typeOfJail = typeOfJail;
    }
}
