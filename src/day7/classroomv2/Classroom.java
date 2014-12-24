package day7.classroomv2;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

	private List<Student> students;

	public Classroom() {
		students = new ArrayList<>();
	}

	public void enter(Student s) {
		students.add(s);
	}

	public void leave(Student s) {
		students.remove(s);
	}

	public int getStudentCount() {
		return students.size();
	}

	public boolean check(Student s) {
		return false;
	}

	public boolean isPresent(Student s) {
		return students.contains(s);
	}

	public void printStudentInfo(Student student) {
		for (Student temp : students) {
			if (temp.equals(student)) {
				System.out.println("StudentName: " + temp.getName());
				System.out
						.println("StudentSecondName: " + temp.getSecondName());
				System.out.println();
			}
		}

	}

	public void allStudents() {
		int i = 0;
		for (Student temp : students) {
			i++;
			System.out.println(i + ". " + temp.getName() + " -- "
					+ temp.getSecondName());
		}
	}
}
