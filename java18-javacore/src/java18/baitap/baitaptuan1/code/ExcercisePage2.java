package java18.baitap.baitaptuan1.code;

public class ExcercisePage2 {
	public static void main(String[] args) {
		int height = 11;
		int width = 50;
		drawUsaFlag(height, width);
	}

	/***
	 * Function draw USA flag
	 * 
	 * @param height height of flag
	 * @param width  width of flag
	 */
	public static void drawUsaFlag(int height, int width) {
		if (height % 2 == 0) {
			drawFirstLines(width, height / 2);
			drawLastLines(width, height / 2);
		} else {
			drawFirstLines(width, (int) height / 2 + 1);
			drawLastLines(width, (int) height / 2);
		}
	}

	/***
	 * Function draw lines which contain '*'
	 * 
	 * @param lineLength length of content in 1 line
	 * @param numOfLine  number of lines contain '*'
	 */
	public static void drawFirstLines(int lineLength, int numOfLine) {
		for (int lineIndex = 0; lineIndex < numOfLine; lineIndex++) { // First 9 line
			// first lines lineLength must be reduced 6
			for (int lineContentIndex = 0; lineContentIndex < lineLength - 6; lineContentIndex++) {
				if (lineContentIndex < numOfLine) {
					if (lineIndex % 2 == 0) { // check odd or even line
						System.out.print(" *"); // if even print " * * * * * *"
					} else {
						System.out.print("* "); // if odd print "* * * * * * "
					}
				} else {
					System.out.print("=");
				}
			}
			System.out.print("\n"); // end line
		}
	}

	/***
	 * Function draw lines which don't contain '*'
	 * 
	 * @param lineLength length of content in 1 line
	 * @param numOfLine  number of lines don't contain '*'
	 */
	public static void drawLastLines(int lineLength, int numOfLine) {
		for (int lineIndex = 0; lineIndex < numOfLine; lineIndex++) {
			for (int lineContentIndex = 0; lineContentIndex < lineLength; lineContentIndex++) {
				System.out.print("=");
			}
			System.out.print("\n");
		}
	}

	/***
	 * Function convert decimal number to binary number
	 * 
	 * @param number positive decimal number
	 * @return binary number in String type
	 */
	public static String convertDecToBin(int number) {

		StringBuilder stringBuilderForNumberBin = new StringBuilder("");
		while (number / 2 != 0) { // Can't get biggest base in while loop. Ex: 7 DEC -> 11 BIN
			stringBuilderForNumberBin.append(number % 2);
			number = number / 2;
		}
		// for number 0,1 and the biggest base for number >= 2
		if (number % 2 == 0) {
			stringBuilderForNumberBin.append(0);
		} else {
			stringBuilderForNumberBin.append(1);
		}

		return stringBuilderForNumberBin.reverse().toString();
	}

}
