package javaPractice;

public class JavaConstructor1 {
	
	String animalName;
	String animalSound;
	
	
	
	public JavaConstructor1(String animalName, String animalSound) {
		super();
		this.animalName = animalName;
		this.animalSound = animalSound;
	}
	
	public void sound() {
		
		System.out.println("Animal : "+this.animalName+" and Sound :" +this.animalSound);
	}

	public static void main(String[] args) {
		
		JavaConstructor1 animal1 = new JavaConstructor1("Dog", "Barking");
		JavaConstructor1 animal2 = new JavaConstructor1("Lion", "Roar");
		
		animal1.sound();
		animal2.sound();
		
	}

}
