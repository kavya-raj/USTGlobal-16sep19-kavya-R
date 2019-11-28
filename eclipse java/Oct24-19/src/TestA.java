
public class TestA {

	static int a;
	int b;
	static {
		a = 10;
		System.out.println("static block() method 1");
	}
	TestA(){
	System.out.println("TestA() method");	
	}
	public static void main(String[] args) {
		TestA t = new TestA();
		TestA t1 = new TestA();
		System.out.println("a value is "+a);
		
	}
	static {
		a = 20;
		System.out.println("static block() method 2");
	}
	static {
		a = 40;
		System.out.println("static block 3");
	}
	}
