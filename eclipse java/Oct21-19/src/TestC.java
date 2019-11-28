
public class TestC {
	public static void main(String[] args) {
		Person p = new Person();
		p.age = 22;
		p.name = "kavya";
		Person.color = "white";//static with class name
		System.out.println("age is "+p.age);
		System.out.println("name is "+p.name);
		System.out.println("color is "+Person.color);//static with class name
		p.eat();
		Person.sleep();//static with class name
		p.sing();

		Person p1 = new Person();
		p1.age = 23;
		p1.name = "kiran";
		System.out.println("age is "+p1.age);
		System.out.println("name is "+p1.name);


	}
}
