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
    import java.util.Arrays;
    import java.util.Scanner;



    public class ReadBoxBoard {

        public static void readTxt() throws FileNotFoundException {
            File file = new File("boxBoard1.txt");
            Scanner sc = new Scanner(file);
            // Data is (int)idBox - (String)boxType - (String)name - (String)color - (int)priceToBuy - (boolean)isMortgaged

            while (sc.hasNext()) {
                String boxRow = sc.nextLine();
                String[] boxData = boxRow.split("-");
                int idBox = Integer.parseInt(boxData[0]);
                String type = boxData[1];

                // Seleccionamos accion segun el type
                if (type.equals("Start")) {
                    System.out.print("Pilla el start --> ");
                    System.out.println(idBox);

                } else if (type.equals("Comucard")) {
                    System.out.print("Pilla el comucard --> ");
                    System.out.println(idBox);

                } else if (type.equals("ChanceCard")) {
                    System.out.println("Pilla el chancecard --> ");
                    System.out.println(idBox);

                } else if (type.equals("TaxBox")) {
                    String typeOfTax = boxData[2];
                    System.out.print("Pilla el TaxBox --> ");
                    System.out.println(idBox);
                    if (typeOfTax.equals("incomeTax")) {
                        System.out.printf(typeOfTax);
                    } else if (typeOfTax.equals("SuperTax")) {
                        System.out.printf(typeOfTax);
                    } else { // Parking Free (Get all the taxes)
                        System.out.printf(typeOfTax);
                    }
                } else if (type.equals("Station")) {
                    System.out.print("Pilla el Station --> ");
                    System.out.println(idBox);

                } else if (type.equals("JailBox")) {
                    String typeJail = boxData[2];
                    System.out.print("Pilla el JailBox --> ");
                    System.out.println(idBox);
                    if (typeJail.equals("JailBox")) {
                        System.out.printf("Tranqui, sólo estás de paso");
                    } else {
                        System.out.printf("Pal Talego");
                    }

                } else if (type.equals("Services")) {
                    System.out.print("Pilla el Services --> ");
                    System.out.println(idBox);

                }else if (type.equals("Property")) { // Property
                    System.out.print("Pilla el property --> ");

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