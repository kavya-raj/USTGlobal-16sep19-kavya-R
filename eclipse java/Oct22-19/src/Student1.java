
public class Student1 {
	int id;
	String name;
	String section;
	double height;
	String gender;
	public Student1(String name, String section,double height,String gender,int id){
		this.name = name;
		this.section = section;
		this.gender = gender;
		this.height = height;
		this.id = id;
		this.diplay();
	}
	void diplay() {
		System.out.println("name is "+name+ " section is "+section+" gender is "+gender+ " height = "+height+" id = "+id);
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1("kavya","first",3.3,"female",1);
		Student1 s2 = new Student1("kiran","second",5.5,"male",2);
		Student1 s3 = new Student1("kamakshi","third",5.1,"female",3);
		Student1 s4 = new Student1("RAju","fourth",5.2,"male",4);
		Student1 s5 = new Student1("ruchika","second",5.8,"female",5);
		Student1 s6 = new Student1("rashmi","second",5.5,"female",6);
		Student1 s7 = new Student1("kiran","second",5.5,"male",2);
		Student1 s8 = new Student1("kiran","second",5.5,"male",2);
		Student1 s9 = new Student1("kiran","second",5.5,"male",2);
		Student1 s10 = new Student1("kiran","second",5.5,"male",2);
	}
}
