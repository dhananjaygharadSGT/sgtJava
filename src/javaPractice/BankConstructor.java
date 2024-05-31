package javaPractice;

public class BankConstructor {
	
	static String ifsc;
	static double ROI;
	
	long acNo;
	double balance;
	
	static {
		ifsc = "BOI1234";
		ROI = 7.0;
	}
	
	
	public BankConstructor(long acNo, double balance) {
		this.acNo = acNo;
		this.balance = balance;
	}


	public static void main(String[] args) {
		BankConstructor bankConstructor1 = new BankConstructor(50684870, 30000);
		BankConstructor bankConstructor2 = new BankConstructor(46625605, 15000);
		
		bankConstructor1.customerDetails();
		bankConstructor2.customerDetails();
	}


	private void customerDetails() {
		System.out.println(ifsc);
		System.out.println(ROI);
		System.out.println(acNo);
		System.out.println(balance);
		
	}
	

}
