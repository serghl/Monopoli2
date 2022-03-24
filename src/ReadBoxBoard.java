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

        public static void readTxt(int pos) throws FileNotFoundException {
            File file = new File("boxBoard1.txt");
            Scanner sc = new Scanner(file);
            // Data is (int)idBox - (String)boxType - (String)name - (String)color - (int)priceToBuy - (boolean)isMortgaged
            String boxRow = sc.nextLine();
            String[] boxData = boxRow.split("-");
            int idBox = Integer.parseInt(boxData[0]);
            String type = boxData[1];

            while (sc.hasNext()) {
                // Seleccionamos accion segun el type

                if (type.equals("Start")) {
                    //StartBox.startCross();

                } else if (type.equals("Comucard")) {


                } else if (type.equals("ChanceCard")) {


                } else if (type.equals("TaxBox")) {
                    String typeOfTax = boxData[2];

                    if (typeOfTax.equals("incomeTax")) {

                    } else if (typeOfTax.equals("SuperTax")) {

                    } else { // Parking Free (Get all the taxes)

                    }
                } else if (type.equals("Station")) {


                } else if (type.equals("JailBox")) {
                    String typeJail = boxData[2];

                    if (typeJail.equals("JailBox")) {
                        System.out.printf("Tranqui, sólo estás de paso");
                    } else {
                        System.out.printf("Pal Talego");
                    }

                } else if (type.equals("Services")) {


                }else if (type.equals("Property")) { // Property

                    System.out.println(idBox );
                    String name = boxData[2];
                    System.out.println(name);
                    String color = boxData[3];
                    int price = Integer.parseInt(boxData[4]);
                    boolean isMortgaged = Boolean.parseBoolean(boxData[5]);
                }
            }

        }


    }