package java18.baitaptuan2.object;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	private List<Student> students = new ArrayList<>();
	private static StudentManager INSTANCE = null;

	private StudentManager() {
	}

	public static StudentManager getInstance() {
		if (INSTANCE != null) {
			return INSTANCE;
		} else {
			INSTANCE = new StudentManager();
			return INSTANCE;
		}
	}

	public List<Student> getAllStudents() {
		return students;
	}

	public int addStudent(Student student) {
		this.students.add(student);
		return this.students.indexOf(student);
	}

	public void removeStudent(Student student) {
		if (this.students.contains(student)) {
			this.students.remove(student);
		}
	}

	public Student getStudentByIndex(int index) {
		return this.students.get(index);
	}
}
