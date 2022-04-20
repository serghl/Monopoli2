/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to roll the dice
 *
 */

import java.util.Objects;

public abstract class Box {
    int idBox;
    String type;

    // Constructor
    public Box() {
        this.idBox = 0;
        this.type = "";
    }

    // Constructor
    public Box(int idBox, String type) {
        this.idBox = idBox;
        this.type = type;
    }

// Getters y setters

    public int getidBox() {
        return this.idBox;
    }

    public void setidBox(int idBox) {
        this.idBox = idBox;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    // Metodos de cada type

//

    @Override
    public String toString() {
        return
                "idBox = " + idBox +
                        " -- > type = " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return idBox == box.idBox && Objects.equals(type, box.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBox, type);
    }
}

