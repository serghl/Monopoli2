/*
 * 21/2/22
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 * 
 * Class to set up a player
 * 
 */

public class Player {

 private String name;
 private int moneyLeft;
 private int positionOnBoard;
 //private ArrayList<Property> propertiesOwned;
 private String icon;
 private boolean isBroken;

 // Constructores

 // Default
 public Player() {
 this.name = "";
 }
 
 // Main Constructor
 public Player(String name, int moneyLeft, int positionOnBoard, String icon, boolean isBroken) {
  this.name = name;
  this.moneyLeft = moneyLeft;
  this.positionOnBoard = positionOnBoard;
  this.icon = icon;
  this.isBroken = isBroken;
 }

// Getters and Setters

 public String getName() {
  return name;
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

 public int getPositionOnBoard() {
  return positionOnBoard;
 }

 public void setPositionOnBoard(int positionOnBoard) {
  this.positionOnBoard = positionOnBoard;
 }

 //public ArrayList<Property> getPropertiesOwned() {
 //return propertiesOwned;
 //}

 //public void setPropertiesOwned(ArrayList<Property> propertiesOwned) {
 // this.propertiesOwned = propertiesOwned;
 //}

 public String getIcon() {
  return icon;
 }

 public void setIcon(String icon) {
  this.icon = icon;
 }
 
 public boolean getIsBroken() {
  return isBroken;
 }

 public void setIsBroken(Boolean isBroken) {
  this.isBroken = isBroken;
 }

 // MOTE METHODS



}
