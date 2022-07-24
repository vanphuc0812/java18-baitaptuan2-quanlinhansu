package java18.baitap.baitaptuan1.code;

public class ExcercisePage6 {

	public static void printSoNguyenTo(int number) {
		for (int i = 1; i <= number; i++) {
			if (checkSoNguyenTo(i))
				System.out.println(i);
		}
	}

	public static int findSoLonNhatNhoHonLog2(int number) {
		if (number <= 0)
			return -1;
		int i = 0;
		while (++i <= calculateLogarit2(number)) {
		}
		return i - 1;
	}

	public static double calculateLogarit2(int number) {
		if (number <= 0) {
			return -1;
		} else {
			return Math.log(number) / Math.log(2);
		}
	}

	public static void drawTriangle(int number) {
		for (int i = 0; i < number; i++) {
			printLine(i);
		}
	}

	public static void printLine(int number) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 1; i < number; i++) {
			stringBuilder.append(i);
		}
		stringBuilder.append("\n");
		System.out.println(stringBuilder.toString());
	}

	public static boolean checkSoNguyenTo(int soN) {
		if (soN <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(soN); i++) {
			if (soN % i == 0) {
				return false;
			}
		}
		return true;
	}

}
