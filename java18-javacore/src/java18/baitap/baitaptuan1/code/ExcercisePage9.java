package java18.baitap.baitaptuan1.code;

public class ExcercisePage9 {
	public static void main(String[] args) {
		giaiPhuongTrinhBac1(0,0);
		giaiPhuongTrinhBac2(1, 2, 1);
	}

	// period là số lần lãi được gộp trên mỗi đơn vị thời gian, nếu lãi được gộp
	// hàng tháng và thời gian tính bằng năm thì n bằng 12. Nếu lãi được gộp hành
	// quý và t tính bằng năm thì n bằng 4.
	public static double calculateMonayAfterDeposit(long currentMoney, int waitingTime, double interestRate,
			int period) {
		return currentMoney * Math.pow(1 + (interestRate / period), period * waitingTime);
	}

	public static int calculateTimeDeposit(long currentMoney, long expectMoney, double interestRate, int period) {
		int time = 0;
		while (calculateMonayAfterDeposit(currentMoney, ++time, interestRate, period) <= expectMoney) {
		}
		return time;
	}

	public static void giaiPhuongTrinhBac1(float aNumber, float bNumber) {
		float solution;
		if (aNumber == 0) {
			if (bNumber == 0) {
				System.out.println("The equation has infinitely many solutions!");
			} else {
				System.out.println("The equation has no solution!");
			}
		} else {
			solution = (float) -bNumber / aNumber; 
			System.out.println("The equation has a solution: x = " + solution + ".");
		}
	}

	public static void giaiPhuongTrinhBac2(float aNumber, float bNumber, float cNumber) {
		// check the coefficients
		if (aNumber == 0) {
			if (bNumber == 0) {
				System.out.println("The equation has no solution!");
			} else {
				System.out.println("The equation has a solution:" + "x = " + (-cNumber / bNumber));
			}
			return;
		}
		// calculate delta
		float delta = bNumber * bNumber - 4 * aNumber * cNumber;
		float solution1;
		float solution2;
		// calculate solutions
		if (delta > 0) {
			solution1 = (float) ((-bNumber + Math.sqrt(delta)) / (2 * aNumber));
			solution2 = (float) ((-bNumber - Math.sqrt(delta)) / (2 * aNumber));
			System.out.println("The equation with 2 solutions is:" + "x1 = " + solution1 + " and x2 = " + solution2);
		} else if (delta == 0) {
			solution1 = (-bNumber / (2 * aNumber));
			System.out.println("The equation has a double solution:" + "x1 = x2 = " + solution1);
		} else {
			System.out.println("The equation has no solution!");
		}
	}

}