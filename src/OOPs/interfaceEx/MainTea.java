package OOPs.interfaceEx;

public class MainTea {
	
	public static void main(String[] args) {
		
		Beverages beverages1 = new GingerTea();
		Beverages beverages2 = new LemonTea();
		Beverages beverages3 = new MasalaTea();
		
		beverages1.order();
		beverages2.order();
		beverages3.order();
		
		
		
	}

}
