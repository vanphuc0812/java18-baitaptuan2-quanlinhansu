package java18.javacore;

import java.util.Scanner;

public class FunctionConvention {
	/**
	 * <Access modifier> <return-type> functionName (parameterType para,...) {
	 * function body
	 * return 
	 * }
	 */
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		sayHello("Phuc", "Mr");
//		System.out.print("Mời nhập một số nguyên:");
//		int number = scanner.nextInt();
//		if (checkOddOrEven(number)) {
//			System.out.printf("Số %d là số chẵn", number);
//		} else {
//			System.out.printf("Số %d là số lẻ", number);
//		}
//	}

	/***
	 * Chương trình in câu chào
	 * 
	 * @param name       Tên của bạn
	 * @param welcomName Cách xưng hô
	 */
	public static void sayHello(String name, String welcomName) {
		System.out.printf("Welcome %s %s to Java course \n", welcomName, name);
	}

	public static boolean checkOddOrEven(int number) {
		return number % 2 == 0;
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
