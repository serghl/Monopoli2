/*
 * 26/3/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to define the tax boxes
 *
 */
public class StationBox extends Box {
    String stationName;

    // Constructor
    public StationBox(int idBox, String typeOfBox ,String stationName) {
        super(idBox, typeOfBox);
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return
                "idBox = " + idBox +
                        " -- > type = " + type +
                        " -- > stationName = " + stationName;
    }
}
