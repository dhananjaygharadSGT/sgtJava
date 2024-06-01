package OOPs.encapsulation;

public class Bank {
	
	String name;
	long acNo;
	private double balance;
	public Bank(String name, long acNo, double balance) {
		
		this.name = name;
		this.acNo = acNo;
		this.balance = balance;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance += balance;
	}
	
	public static void main(String[] args) {
		
		Bank customer1 = new Bank("Dhananjay", 1234567890, 50000);
		
		System.out.println(customer1.name);
		System.out.println(customer1.acNo);
		System.out.println(customer1.balance);
	}
	
	
	
	

}
