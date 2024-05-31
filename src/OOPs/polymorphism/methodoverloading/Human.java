package OOPs.polymorphism.methodoverloading;

public class Human {
	
	public static void behaviour()
	{
		System.out.println("Behaviour 1");
	}
	public static void behaviour(String type)
	{
		System.out.println("Behaviour 2");
	}
	public static void behaviour(double d)
	{
		System.out.println("Behaviour 3");
	}
	public static void main(String[] args) 
	{
		behaviour();
		behaviour("Dhananjay");
		behaviour(10);
	}

}
