 /*
  * 24/2/22
  *
  * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
  *
  * Method to read the .txt board file
  *
  */

 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;


 public class ReadBoxBoard {
     // Method to crete a board with diferent "sons" of Box class
     public static Box[] readTxt() throws FileNotFoundException {
         File file = new File("boxBoard1.txt");
         Scanner sc = new Scanner(file);
         Box[] monopolyBoard = new Box[40];
         // Data is (int)idBox - (String)boxType - (String)name - (String)color - (int)priceToBuy - (boolean)isMortgaged
         int i = 0;
         while (sc.hasNext() && i < monopolyBoard.length) {
             // Seleccionamos accion segun el type
             String boxRow = sc.nextLine();
             // Almacenamos los datos del .txt en un vector de Strings
             String[] boxData = boxRow.split("-");
             int idBox = Integer.parseInt(boxData[0]);
             String type = boxData[1];
             if (idBox == i && type.equals("Start")) {
                 monopolyBoard[i] = new StartBox(idBox, type);
                 i++;
             } else if (idBox == i && type.equals("Comucard")) {
                 monopolyBoard[i] = new ComuBox(idBox, type);
                 i++;
             } else if (idBox == i && type.equals("ChanceCardBox")) {
                 monopolyBoard[i] = new ChanceCardBox(idBox, type);
                 i++;
             } else if (idBox == i && type.equals("TaxBox")) {
                 String typeOfTax = boxData[2];
                 monopolyBoard[i] = new TaxBox(idBox, type, typeOfTax);
                 i++;
             } else if (idBox == i && type.equals("Station")) {
                 String stationName = boxData[2];
                 String propietary = boxData[3];
                 int price = Integer.parseInt(boxData[4]);
                 monopolyBoard[i] = new StationBox(idBox, type, stationName, propietary, price);
                 i++;
             } else if (idBox == i && type.equals("JailBox")) {
                 String typeOfJail = boxData[2];
                 monopolyBoard[i] = new JailBox(idBox, type, typeOfJail);
                 i++;
             } else if (idBox == i && type.equals("Services")) {
                 String typeOfServices = boxData[2];
                 monopolyBoard[i] = new ServicesBox(idBox, type, typeOfServices);
                 i++;
             } else if (idBox == i && type.equals("Property")) { // Property
                 String name = boxData[2];
                 String color = boxData[3];
                 int price = Integer.parseInt(boxData[4]);
                 // boolean isMortgaged = Boolean.parseBoolean(boxData[5]);
                 String propietary = boxData[5];
                 monopolyBoard[i] = new PropertyBox(idBox, type, name, color, price, propietary);
                 i++;
             }
         }
            /*
             //ESTO PARA IMPRIMIR EL TABLERO!!
                         for (int j = 0; j < monopolyBoard.length; j++) {
                System.out.println(monopolyBoard[j].toString());
            }
*/
         return monopolyBoard;
     }

     // Method to return the Box type, to work it out with the ActionsOnLand
     public static Box getTypeOfBox(int pos) throws FileNotFoundException {
         Box[] monopolyBoard = ReadBoxBoard.readTxt();
         return monopolyBoard[pos];
     }


 }


