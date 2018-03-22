package Students;
/*
Create a Student Database with the following attributes:
- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)

*/

public class Student {
	//Properties
	private static int iD = 1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String City;
	private String State;
	public String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	
	public Student(String name, String ssn) {
		System.out.println("New student added!");
		// increment iD numbers
		iD++;
		this.ssn = ssn;
		this.name = name;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}
	
	private void setEmail() {
		email = name.toLowerCase()+"."+iD+ "@myapp.com";
		System.out.println("Your email is: "+email);
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setUserId() {
		// random number between 1000 - 9000
		int max = 9000;
		int min = 1000;
		int randnum = (int) (Math.random() * ((max - min)));
		randnum = randnum + min;
		// set userId
		userId = iD +""+randnum + ssn.substring(5);
		System.out.println("Your User ID: "+userId);
	}
	
	public void enroll(String course) {
		// add a course everytime we enroll
		this.courses = this.courses + " " + course;
		System.out.println(courses);
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment: $"+amount);
		balance = balance - amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance: "+balance);
	}
	
	public void showCourses() {
		System.out.println("Courses: "+courses);
	}
	
	public String toString() {
		return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\nBALANCE: " + balance + "]";
	}
}

