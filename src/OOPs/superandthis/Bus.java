package OOPs.superandthis;

// this statement

public class Bus {
	
	Bus(){
		System.out.println("No arg type constructor.");
	}
	
	Bus(int a){
		System.out.println("int arg type constructor.");
	}
	
	Bus(String s){
		this();
		System.out.println("String arg type constructor.");
	}
	
	public static void main(String[] args) {
		System.out.println("main method starts.");
		Bus bus = new Bus(100);
		System.out.println("Main ends.");
	}

}
