/*
 * 26/3/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to define the tax boxes
 *
 */

public class PropertyBox extends Box {
    String name;
    String color;
    int price;
    boolean isMortgaged;
    String propietary;

    // Constructor
    public PropertyBox(int idBox, String typeOfBox , String name, String color, int price, boolean isMortgaged,
                       String propietary) {
        super(idBox, typeOfBox);
        this.name = name;
        this.color = color;
        this.price = price;
        this.isMortgaged = isMortgaged;
        this.propietary = propietary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isMortgaged() {
        return isMortgaged;
    }

    public void setMortgaged(boolean mortgaged) {
        isMortgaged = mortgaged;
    }

    public String getPropietary() {
        return this.propietary;
    }

    public void setPropietary(String propietary) {
        this.propietary = propietary;
    }

    @Override
    public String toString() {
        return
                "idBox = " + idBox +
                        " -- > type = " + type +
                        " -- > name = " + name +
                        " -- > color = " + color +
                        " -- > price = " + price +
                        " -- > isMortgaged = " + isMortgaged +
                        " -- > propietary = " + propietary;
    }

}
