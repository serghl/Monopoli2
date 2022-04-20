 /*
  * 26/2/22
  *
  * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
  *
  * Method to read the .txt board file
  *
  */

 public class ServicesBox extends Box {
     String typeOfServices;

     // Constructor
     public ServicesBox(int idBox, String typeOfBox, String typeOfServices) {
         super(idBox, typeOfBox);
         this.typeOfServices = typeOfServices;
     }

     @Override
     public String toString() {
         return
                 "idBox = " + idBox +
                         " -- > type = " + type +
                         " -- > typeOfServices = " + typeOfServices;
     }

 }
