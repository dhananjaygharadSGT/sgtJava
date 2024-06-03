package OOPs.inheritance;

public class District extends State{
	
public static void mayor() {
		
		System.out.println("Control over the perticular Municiple Corp.");
		
	}
	
	public static void main(String[] args) {
		
		District district = new District();
		
		district.primeMinister();
		district.chiefMinister();
		district.mayor();
		
	}

}
