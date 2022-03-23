/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to roll the dice
 *
 */

public class Box {
    private int index;
    private String type;
    private Box typeOf;
    
    // Constructor
    public Box(int index, String type, Box typeOf) {
        this.index = index;
        this.type = type;
        this.typeOf = typeOf;
    }
    
// Getters y setters
    
    public int getIndex() {
        return index;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    // Método para definir la accion dependiendo del tipo de casilla
    /*
     public Box typeOf
     
     {
     
     if (type == "Property") {
     
     } else if (type == "Comucard") {
     
     } else if (type == "ChanceCard") {
     
     } else if (type == "Station") {
     
     } else if (type == "JailBox") {
     
     } else if (type == "TaxBox") {
     
     } else if (type == "Services") {
     
     //Remaining option is the start Box
     } else {
     
     }
     
     // Metodos de cada type
     
     public void propertyBox {
     
     }
     */
}

