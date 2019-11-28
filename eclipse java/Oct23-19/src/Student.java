
public class Student {
	String name;
	int roolno;
	final String cname = "Qspiders";
	final int cid;
	Student(String name,int roolno,int cid){
		this.name = name;
		this.roolno = roolno;
		this.cid = cid;
	}
		Student(int cid){
			this.cid = cid;
		}

	final void printDetails() {
		System.out.println("HI "+name + " Welcome to" +cname);
	}
	final void printDetails(String name) {
		System.out.println("Hi "+name + " Welcome to " +cname);
	}
}
