package day7.classroomv1;


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

	public void isPresent(String name, String secondName) {
		for (Student temp : students) {

			if (name != null && secondName != null) {
				if (temp.getName().equals(name)
						&& temp.getSecondName().equals(secondName)) {
					System.out.println(temp.getName() + " "
							+ temp.getSecondName() + " ---> "
							+ "This student is present");
					return;
				}
			}

		}
		System.out.println("This student is NOT present");
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

	public void getStudents() {
		int i = 0;
		for (Student temp : students) {
			i++;
			System.out.println(i + ". " + temp.getName() + " -- "
					+ temp.getSecondName());
		}
	}
}
