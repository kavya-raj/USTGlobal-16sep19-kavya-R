
public class TestB {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.color = "green";
		c.name = "priya";
		System.out.println("color is"+c.color);
		System.out.println("name is"+c.name);
		c.eat();
		c.sleep();
		
		System.out.println("*********************");
		
		Cow c1 = new Cow();
		c1.color="blue";
		c1.name = "sherima";
		System.out.println("color is "+c1.color);
		System.out.println("name is"+c1.name);
		c1.eat();
		c1.sleep();
	}

}
