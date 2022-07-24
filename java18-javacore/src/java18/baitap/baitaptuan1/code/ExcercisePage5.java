package java18.baitap.baitaptuan1.code;

public class ExcercisePage5 {

	public static String upperCaseFirstCharacter(String string) {
		StringBuffer stringBuilder = new StringBuffer();

		for (String word : string.split(" ")) {
			if (!"".equals(word)) {
				stringBuilder.append(Character.toUpperCase(word.charAt(0)));
				stringBuilder.append(word.substring(1)).append(" ");
			}
		}
		return stringBuilder.toString().trim();
	}

	public static boolean checkSameNumOfChar(int number1, int number2) {
		return String.valueOf(number1).length() == String.valueOf(number2).length();
	}
}
