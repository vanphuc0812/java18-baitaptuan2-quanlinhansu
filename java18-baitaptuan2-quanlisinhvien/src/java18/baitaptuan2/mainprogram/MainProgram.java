package java18.baitaptuan2.mainprogram;

import java.io.IOException;
import java.util.Scanner;

import java18.baitaptuan2.object.Student;

public class MainProgram {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input student's name: ");
		String name = scanner.nextLine();
		System.out.print("Input student's math score: ");
		float mathScore = Float.parseFloat(scanner.nextLine());
		System.out.print("Input student's physic score: ");
		float physicScore = Float.parseFloat(scanner.nextLine());
		System.out.print("Input student's chemistry score: ");
		float chemistryScore = Float.parseFloat(scanner.nextLine());

		Student student = new Student(name);
		student.setMathScore(mathScore);
		student.setChemistryScore(chemistryScore);
		student.setPhysicScore(physicScore);
		
		System.out.printf("The average score of %s: %f\n", student.getName(), student.getAverageScore());
		System.out.printf("The rank of %s: %s\n", student.getName(), student.getRank());
	}
}
