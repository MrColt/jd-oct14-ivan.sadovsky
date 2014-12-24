package day7.classroomv1;


public class Demo {

	public static void main(String[] args) {
		Classroom cr = new Classroom();
		
		Student a = new Student("Ivan", "Ivanov");
		cr.enter(a);
		Student b = new Student("Nikolai", "Nikolaev");
		cr.enter(b);
		Student c = new Student("Fedor", "Fedorovich");
		cr.enter(c);
		Student d = new Student("Oleg", "Olegovich");
		cr.enter(d);
		Student e = new Student("Aleksei", "Aleksandrovich");
		cr.enter(e);
		
//		cr.printStudentInfo(a);
//		cr.printStudentInfo(b);
//		cr.isPresent("Ivan", "Ivanov");
//		cr.isPresent("Kate", "Kate");
//		cr.getStudents();
		
		System.out.println("StudentCount: " + cr.getStudentCount());
		
		
	}

}
