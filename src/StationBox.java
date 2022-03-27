/*
 * 26/3/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to define the tax boxes
 *
 */
public class StationBox extends Box {
    private String stationName;
    private String propietary;
    private int price;

    // Constructor
    public StationBox(int idBox, String type ,String stationName, String propietary, int price) {
        super(idBox, type);
        this.stationName = stationName;
        this.propietary = propietary;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getPropietary() {
        return propietary;
    }

    public void setPropietary(String propietary) {
        this.propietary = propietary;
    }



    @Override
    public String toString() {
        return
                "idBox = " + this.idBox +
                        " -- > type = " + this.type +
                        " -- > stationName = " + this.stationName +
                        " -- > propietary = " + this.propietary +
                        " -- > price = " + this.price;
    }
}
