package java18.baitaptuan2.mainprogram;

import java.io.IOException;
import java.util.Scanner;

import java18.baitaptuan2.object.Student;
import java18.baitaptuan2.object.StudentManager;

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

		StudentManager studentManager = StudentManager.getInstance();
		int indexOfNewStudent = studentManager.addStudent(new Student(name, mathScore, chemistryScore, physicScore));

		System.out.printf("The average score of %s: %f\n",
				studentManager.getStudentByIndex(indexOfNewStudent).getName(),
				studentManager.getStudentByIndex(indexOfNewStudent).getAverageScore());
		System.out.printf("The rank of %s: %s\n", studentManager.getStudentByIndex(indexOfNewStudent).getName(),
				studentManager.getStudentByIndex(indexOfNewStudent).getRank());
	}
}
