package OOPs.encapsulation;

public class Manager {
	
	public static void main(String[] args) {
		
		Bank customer1 = new Bank("Dhananjay", 1234567890, 50000);
		
		System.out.println(customer1.name);
		System.out.println(customer1.acNo);
		System.out.println(customer1.getBalance());
		customer1.setBalance(-25000);
		System.out.println(customer1.getBalance());
		customer1.setBalance(+65000);
		System.out.println(customer1.getBalance());
	}

}
