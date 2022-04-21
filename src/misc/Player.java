package misc;/*
 * 21/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to set up a player
 *
 */

import boxes.Box;

import java.util.ArrayList;

public class Player {

    private String name;
    private int moneyLeft;
    private int pos;
    private int turnsJail;
    private ArrayList<Box> properties;

    // Constructores

    // Default
    public Player() {
        this.name = "";
    }

    // Main Constructor
    public Player(String name, int moneyLeft, int pos) {
        this.name = name;
        this.moneyLeft = moneyLeft;
        this.pos = pos;
        this.turnsJail = 0;

        this.properties = new ArrayList<Box>();
    }

// Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyLeft() {
        return moneyLeft;
    }

    public void setMoneyLeft(int moneyLeft) {
        this.moneyLeft = moneyLeft;
    }

    public int getPos() {
        return this.pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getTurnsJail() {
        return turnsJail;
    }

    public void setTurnsJail(int turnsJail) {
        this.turnsJail = turnsJail;
    }

    public ArrayList<Box> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Box> properties) {
        this.properties = properties;
    }

    // To String

    @Override
    public String toString() {
        return "Name : " + this.name +
                " - MoneyLeft = " + this.moneyLeft +
                " - Position = " + this.pos
                ;
    }

    // MORE METHODS

    // Add a property
    public boolean add(Box property) {
        return this.properties.add(property);
    }

    // Show the list of properties1
    public void showProperties() {
        System.out.println("Estas son tus propiedades : ");
        for (int i = 0; i < properties.size(); i++)
            // TODO PREGUNTAR AQUI COMO TENER ACCESO AL NOMBRE DE LA CLASE HIJA
            System.out.println(properties.get(i).getidBox() + "-" + properties.get(i).getType());
    }

    // Pay an amount of money
    public void pay(int amount) {
        if (getMoneyLeft() > amount) {
            this.moneyLeft -= amount;
        } else {
            System.out.println("No tienes suficiente lana para esto!");
        }
    }
// TODO CONSULTA CON RAFEL SI ES MAS EFICIENTE CONSULTAR UN ATRIBUTO O UN METODO

    // Get player in Jail
/*
 public void toJail() {
       setPos(10);
       setTurnsJail(3);
 }
*/
    // Receive an amount of money

    public void receive(int amount) {
        this.moneyLeft += amount;
    }


}
