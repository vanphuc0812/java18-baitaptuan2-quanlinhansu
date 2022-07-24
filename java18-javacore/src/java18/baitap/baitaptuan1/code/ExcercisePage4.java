package java18.baitap.baitaptuan1.code;

import java.util.ArrayList;
import java.util.List;

public class ExcercisePage4 {

	// return -1 if number <1
	public static int caculateFactorial(int number) {
		if (number <= 0)
			return -1;
		if (number == 0)
			return 0;
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}

	public static double calculateTwoPointDistance(double hoanhDoDiem1, double tungDoDiem1, double hoanhDoDiem2,
			double tungDoDiem2) {
		double distance = Math.pow((hoanhDoDiem1 - hoanhDoDiem2), 2);
		distance += Math.pow((tungDoDiem1 - tungDoDiem2), 2);
		return Math.sqrt(distance);
	}

	public static String reverseString(String string) {
		return new StringBuilder(string).reverse().toString();
	}

	public static List<Integer> findDivisors(int number) {
		ArrayList<Integer> arrayDivisors = new ArrayList<>();
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0)
				arrayDivisors.add(i);
		}
		arrayDivisors.add(number);
		return arrayDivisors;
	}
}
