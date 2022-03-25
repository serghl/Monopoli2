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
            String boxRow = sc.nextLine();
            String[] boxData = boxRow.split("-");
            int idBox = Integer.parseInt(boxData[0]);
            String type = boxData[1];
            Box[] monopolyBoard = new Box[40];
            int i = 0;
            while (sc.hasNext() && i > monopolyBoard.length ) {
                // Seleccionamos accion segun el type

                if (idBox == i && type.equals("Start")) {
                    monopolyBoard[i] = new Box(idBox, type);
                    i++;
                } else if (idBox == i && type.equals("Comucard")) {
                    monopolyBoard[i] = new Box(idBox, type);
                    i++;
                } else if (idBox == i && type.equals("ChanceCard")) {
                    monopolyBoard[i] = new Box(idBox, type);
                    i++;
                } else if (idBox == i && type.equals("TaxBox")) {
                    String typeOfTax = boxData[2];
                    monopolyBoard[i] = new Box(idBox, type);
                    i++;
/*
                    if (typeOfTax.equals("incomeTax")) {

                    } else if (typeOfTax.equals("SuperTax")) {

                    } else { // Parking Free (Get all the taxes)

                    }

 */
                } else if (idBox == i && type.equals("Station")) {
                    monopolyBoard[i] = new Box(idBox, type);
                    i++;

                } else if (idBox == i && type.equals("JailBox")) {
                    String typeJail = boxData[2];
                    monopolyBoard[i] = new Box(idBox, type);
                    i++;
                    /*
                    if (typeJail.equals("JailBox")) {
                        System.out.printf("Tranqui, sólo estás de paso");
                    } else {
                        System.out.printf("Pal Talego");
                    }
*/
                } else if (idBox == i && type.equals("Services")) {
                    monopolyBoard[i] = new Box(idBox, type);
                    i++;
                } else if (idBox == i && type.equals("Property")) { // Property
                    monopolyBoard[i] = new Box(idBox, type);
                    i++;
                    System.out.println(idBox );
                    String name = boxData[2];
                    System.out.println(name);
                    String color = boxData[3];
                    int price = Integer.parseInt(boxData[4]);
                    boolean isMortgaged = Boolean.parseBoolean(boxData[5]);
                }
            }
System.out.println(Arrays.toString(monopolyBoard));
        }


    }