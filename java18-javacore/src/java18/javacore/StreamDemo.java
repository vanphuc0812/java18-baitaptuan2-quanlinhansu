package java18.javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		// Collections
		List<Student> students = new ArrayList<>();
		students.add(new Student("SV01", "Micheal Cor", GENDER.MALE, 3.8f));
		students.add(new Student("SV02", "Emma Wason", GENDER.FEMALE, 1.8f));
		students.add(new Student("SV03", "Micheal Ben", GENDER.MALE, 2.8f));
		students.add(new Student("SV04", "Jeri Cor", GENDER.FEMALE, 3.0f));
		students.add(new Student("SV04", "Jeri Cor", GENDER.FEMALE, 4.0f));

		List<Student> femaleStudents = new ArrayList<>();

		Predicate<Student> femaleStudentPredicate = st -> st.gender == GENDER.FEMALE;

		femaleStudents = students.stream()
				.filter(femaleStudentPredicate)
				.collect(Collectors.toList());
		System.out.println(femaleStudents);
		
		List<Student> graduatedStudents = students.parallelStream()
				.filter(st -> st.avgPoint >= 2f)
				.collect(Collectors.toList());
		System.out.println(graduatedStudents);
		
		List<String> maxPointStudent = students.stream()
				.filter(st -> st.avgPoint == 4f)
				.map(st -> st.name)
				.collect(Collectors.toList());
		System.out.println(maxPointStudent);
		
		//check if all student have passed the test
		boolean allPassed = students.stream().allMatch(st -> st.avgPoint >=2);
		System.out.println(allPassed);
	
		//check if any student has avg = 4
		boolean hasMaxPointStudent = students.stream().anyMatch(st -> st.avgPoint ==4);
		System.out.println(hasMaxPointStudent);
	}

	// inner class
	public static class Student {
		protected String code;
		protected String name;
		protected GENDER gender;
		protected float avgPoint;

		protected Student(String code, String name, GENDER gender, float avgPoint) {
			this.code = code;
			this.name = name;
			this.gender = gender;
			this.avgPoint = avgPoint;
		}

		@Override
		public String toString() {
			return this.name;
		}

	}

	public static enum GENDER {
		MALE, FEMALE
	}

}
