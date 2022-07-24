package java18.javacore;

public class CodingStyle {

	public static void main(String[] args) {
		// trong body của if chỉ có 1 dòng -> giữ scope
		functionWithDoccumentation("Phuc", 22);

		/**
		 * CLEAN CODE
		 */

		/**
		 * Đặt tên có ý nghĩa 
		 * Tên hàm có ý nghĩa 
		 * Nên tách hàm nếu thấy code quá dài
		 * 
		 * Pseudo code
		 */

	}

	/***
	 * 
	 * @param name
	 * @param age
	 */
	public static void functionWithDoccumentation(String name, int age) {
		System.out.println(name + age);
	}
}
