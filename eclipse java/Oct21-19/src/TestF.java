
public class TestF {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add();
		c.mul();

		System.out.println("******************");

		SciCalculator s = new SciCalculator();
		s.add();
		s.cos();
		s.mul();
		s.sin();
	}
}
