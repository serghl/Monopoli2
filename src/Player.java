/*
 * 21/2/22
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 * 
 * Class to set up a player
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Player {

 private String name;
 private int moneyLeft;
 private static int pos;
 private boolean isBroken;
 private ArrayList<Box> properties;

 // Constructores

 // Default
 public Player() {
 this.name = "";
 }
 
 // Main Constructor
 public Player(String name, int moneyLeft, int pos, boolean isBroken) {
  this.name = name;
  this.moneyLeft = moneyLeft;
  this.pos = pos;
  this.isBroken = isBroken;
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

 public static int getPos() {
  return pos;
 }

 public static void setPos(int pos) {
  Player.pos = pos;
 }

 public boolean getIsBroken() {
  return isBroken;
 }

 public void setIsBroken(Boolean isBroken) {
  this.isBroken = isBroken;
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
  return  "moneyLeft = " + moneyLeft +
          " - pos = " + pos +
          " - isBroken = " + isBroken
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

 // Receive an amount of money

 public void receive(int amount) {
  this.moneyLeft += amount;
 }


}
