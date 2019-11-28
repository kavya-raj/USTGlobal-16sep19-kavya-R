
public class TestG {
public static void main(String[] args) {
	FirstGen f = new FirstGen();
	f.call();
	f.msg();
	System.out.println("******************");
	
	SecondGen s = new SecondGen();
	s.games();
	s.call();
	s.msg();
	System.out.println("******************");
	
	ThirdGen t = new ThirdGen();
	t.call();
	t.camera();
	t.games();
	t.msg();
}
}
