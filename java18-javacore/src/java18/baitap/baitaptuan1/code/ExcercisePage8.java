package java18.baitap.baitaptuan1.code;

import java.util.Random;

public class ExcercisePage8 {
	public static void main(String[] args) {
		gameGuessNumber(500);
	}

	public static int stringLength(String inputString) {
		if (inputString != null)
			return inputString.length();
		else
			return -1;
	}

	public static char charAtIndex(String inputString, int index) {
		if (inputString != null && index < inputString.length())
			return inputString.charAt(index);
		else
			return 1;
	}

	public static boolean checkSubstring(String inputString, String subString) {
		return (inputString.indexOf(subString) != -1);
	}

	public static boolean checkNamNhuan(int nam) {
		if (nam % 400 == 0)
			return true;
		else
			return false;
	}

	public static boolean gameGuessNumber(int guessNumber) {
		Random rand = new Random();
		int secretNumner = rand.nextInt(1000) + 1;
		if (guessNumber == secretNumner) {
			System.out.println("Congratuation! You are correct");
			return true;
		} else if (guessNumber > secretNumner) {
			System.out.println("Your number is higher than secret number");
			return false;
		} else {
			System.out.println("Your number is lower than secret number");
			return false;
		}
	}

}
