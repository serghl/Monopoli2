package misc;

import boxes.Box;

/*
 * 24/2/22
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * Class to roll the dice
 *
 */
public class Board {
    private Box[] length;
    private Player[] players;

    // Getters y setters

    public Box[] getLength() {
        return length;
    }

    public void setLength(Box[] length) {
        this.length = length;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }


    // Constructores

    // Por defecto

    public Board() {
        super();
        this.length = new Box[40];
        this.players = new Player[0];
    }

    // Con el numero de jugadores seleccionados

    public Board(Box[] length, Player[] players) {
        super();
        this.length = new Box[40];
        this.players = players;
    }

}
