package OOPs.inheritance;

//Single level inheritance

public class State extends Country{
	
	public static void chiefMinister() {
		
		System.out.println("Control over the perticular state.");
		
	}
	
	public static void main(String[] args) {
		
		State state = new State();
		
		state.primeMinister();
		state.chiefMinister();
		
	}

}
