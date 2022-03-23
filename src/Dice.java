/*
 * 21/2/22
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 * 
 * Class to roll the dice
 * 
 */
public class Dice {
	
	static int diceTotal;
	static boolean isDouble;
	
		public static int rollDice() {
			// Declare the option of get two similar numbers on the dices
			boolean isDouble = false;
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			if (dice1 == dice2) {
				isDouble = true;
			}
			diceTotal = dice1 + dice2;
			return diceTotal;
		}
}
