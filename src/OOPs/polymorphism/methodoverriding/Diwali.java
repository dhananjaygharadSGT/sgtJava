package OOPs.polymorphism.methodoverriding;

public class Diwali extends Festival {
	
	public void celebrate() {
		
		System.out.println("Diwali is biggest fest in India.");
		
	}
	
	public static void main(String[] args) {
		Diwali diwali = new Diwali();
		diwali.celebrate();
		
		Festival festival = new Festival();
//		Festival festival = diwali;
		festival.celebrate();
		
	}

}
