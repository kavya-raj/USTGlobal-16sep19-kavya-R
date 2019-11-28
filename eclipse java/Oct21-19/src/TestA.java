
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.brand = "DOMS";
		p.color = "black";
		System.out.println("Cost is "+p.cost);
		System.out.println("Brand is "+p.brand);
		System.out.println("Color is "+p.color);
		p.write();
		
		System.out.println("********************");
		Van v = new Van();
		v.color = "red";
		v.cost = 34000;
		System.out.println("color is "+v.color);
		System.out.println("cost is "+v.cost);
		v.move();
		Van v1 = new Van();
		v1.color = "pink";
		v1.cost = 23000;
		System.out.println("color is "+v1.color);
		System.out.println("cost is "+v1.cost);
		v1.move();
		System.out.println("******************************");
	}
}
