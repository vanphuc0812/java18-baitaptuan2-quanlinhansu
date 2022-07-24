package java18.baitap.baitaptuan1.code;

public class ExcercisePage10 {
	public static void main(String[] args) {
	}

	public static int[] separateToEvenArray(int[] inputArray) {
		int numOfEvenElement = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 == 0) {
				numOfEvenElement++;
			}
		}
		int[] outputArray = new int[numOfEvenElement];
		numOfEvenElement = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 == 0) {
				outputArray[numOfEvenElement++] = inputArray[i];
			}
		}
		return outputArray;
	}

	public static int[] separateToOddArray(int[] inputArray) {
		int numOfOddElement = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 != 0) {
				numOfOddElement++;
			}
		}
		int[] outputArray = new int[numOfOddElement];
		numOfOddElement = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] % 2 != 0) {
				outputArray[numOfOddElement++] = inputArray[i];
			}
		}
		return outputArray;
	}

	public static boolean checkMeetKangaroo(int locationOfKan1, int speedOfKan1, int locationOfKan2, int speedOfKan2) {
		if (speedOfKan1 == speedOfKan2 && locationOfKan1 != locationOfKan2)
			return false;
		boolean checkHigherLocation = locationOfKan1 > locationOfKan2;
		while (locationOfKan1 != locationOfKan2) {
			locationOfKan1 += speedOfKan1;
			locationOfKan2 += speedOfKan2;
			if (checkHigherLocation != locationOfKan1 > locationOfKan2) {
				return false;
			}
		}
		return true;
	}

}
