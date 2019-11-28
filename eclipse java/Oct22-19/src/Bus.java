

public class Bus {
int seats;
String color;
Bus(int seats,String color){
	this.color = color;
	this.seats = seats;
	
}
Bus(){
	this(40);
	}
Bus(int seats){
	this(seats,"red");
	
}
void details() {
	System.out.println("Welcome to redbus,bus capacity is "+seats);
}
}
