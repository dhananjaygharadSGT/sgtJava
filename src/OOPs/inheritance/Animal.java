package OOPs.inheritance;

public class Animal {
	
	static String name;

}

class Dog extends Animal{
	
	public static void main(String[] args) {
		System.out.println(name);
	}
	
}

class Lion extends Animal{
	
	static String color = "Brown";
	
	public static void main(String[] args) {
		
		name = "Lion";
		
		System.out.println(name);
		System.out.println(color);
	}
}

