
public class TestA {
public static int add(int a, int b) {
	System.out.println("add( int a, int b) method");
	return a + b;
}
public static long add(long a, int b) {
	System.out.println("add( int a, int b) method");
	return a + b;
}

public static void add(int a , byte b) {
	System.out.println("add( int a, int b) method");
}

public  int multiply(byte a, int b) {
	System.out.println("multiply  method");
return a + b;
}

public  int multiply(int a,int b) {
	System.out.println("multiply  method");
return a + b;
}

public static void main(String[] args) {
	System.out.println("main method");
	main(10);
	add(10,12);
	add(12,34);
	add(98,56); 
	TestA t = new TestA();
	t.multiply(12,45);
	t.multiply(10,20);
}
public static void main(int a) {
	System.out.println("main(int a)method");
	
}

}
