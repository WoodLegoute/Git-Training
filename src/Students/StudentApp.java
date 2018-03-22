package Students;

public class StudentApp {

	public static void main(String[] args) {
		Student student1 = new Student("Wood","000070364");
		Student student2 = new Student("Woody","000070363");
		
		student1.enroll("Math201");
		student2.enroll("English101");
		
		student1.checkBalance();
		//student1.showCourses();
		student1.payTuition(100);
		//student1.checkBalance();
		System.out.println(student1.toString());
		
	}

}
