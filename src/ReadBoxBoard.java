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

        public static void readTxt() throws FileNotFoundException {
            File file = new File("boxBoard1.txt");
            Scanner sc = new Scanner(file);
         // Load all the .txt file properties, all the boxes
            // Data is (int)idBox - (String)boxType - (String)name - (String)color - (int)priceToBuy - (boolean)isMortgaged
            String boxRow = sc.nextLine();
            String[] boxData = boxRow.split("-");
            // Buscamos propiedades dentro del bucle?
            int idBox = Integer.parseInt(boxData[0]);
            String type = boxData[1];

            while (sc.hasNext()) {
                System.out.println("no tira");


                // Seleccionamos accion segun el type
                if (type.equals("Start")) {
                    System.out.println("Pilla el start");
                    System.out.println(idBox);

                }
                if (type.equals("Comucard")) {
                    System.out.print("Pilla el comucard");
                    System.out.print(idBox);

                }
                if (type.equals("ChanceCard")) {
                    System.out.print("Pilla el chancecard");
                    System.out.print(idBox);

                }
                if (type.equals("TaxBox")) {
                    System.out.print(idBox);

                }
                if (type.equals("Station")) {
                    System.out.print(idBox);

                }
                if (type.equals("JailBox")) {
                    System.out.print(idBox);

                }
                if (type.equals("Services")) {
                    System.out.print(idBox);

                }
                if (type.equals("Property")) { // Property
                    String name = boxData[2];
                    String color = boxData[3];
                    int price = Integer.parseInt(boxData[4]);
                    boolean isMortgaged = Boolean.parseBoolean(boxData[5]);
                }
            }

        }


    }