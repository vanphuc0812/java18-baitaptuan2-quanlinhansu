package java18.baitap.baitaptuan1.code;

public class ExcercisePage12 {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("thequickbrownfoxxofnworbquickthe"));
	}

	public static String longestPalindrome(String inputString) {
		if (inputString == null || inputString.length() < 1) {
			return "";
		}
		int start = 0, end = 0;
		for (int i = 0; i < inputString.length(); i++) {
			int len1 = expandAroundCenter(inputString, i, i);
			int len2 = expandAroundCenter(inputString, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return inputString.substring(start, end + 1);
	}

	private static int expandAroundCenter(String string, int leftIndex, int rightIndex) {
		while (leftIndex >= 0 && rightIndex < string.length()
				&& string.charAt(leftIndex) == string.charAt(rightIndex)) {
			leftIndex--;
			rightIndex++;
		}
		return rightIndex - leftIndex - 1;
	}
}
