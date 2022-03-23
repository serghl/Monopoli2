/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Method to read the .txt board file
 *
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MonopolyRunner {
    
    
    
    public static void main(String[] args) throws FileNotFoundException {
        
        ReadBoxBoard b1 = new ReadBoxBoard();
        b1.readTxt();
        
    }
    
    
}