
public class TestE {
	public static void main(String[] args) {
		Student.cname = "qspiders";
		Student s1 = new Student();
		s1.name = "kavya";
		s1.usn = 100;
		System.out.println("College name is "+Student.cname);
		System.out.println("Name is "+s1.name);
		System.out.println("ID is "+s1.usn);
	}
}
