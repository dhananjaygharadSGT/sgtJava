package OOPs.superandthis;

public class Bike extends Vehicle{
	
	String color;

	public Bike(String type, String color) {
		super(type);
		this.color = color;
	}
	
	public static void main(String[] args) {
		
		Bike bike = new Bike("Racing", "Black");
		
		System.out.println(bike.type);
		System.out.println(bike.color);
	}

}
