package javaPractice;

public class JavaConstructor {
	
	int sId;
	String name;
	int age;
	long mobileNo;
	JavaConstructor(int sId, String name, int age, long mobileNo)
	{
		this.sId = sId;
		this.name = name;
		this.age = age;
		mobileNo= mobileNo;
	}
	public static void main(String[] args) 
	{
		JavaConstructor s1 = new JavaConstructor(101, "Ramesh", 18, 9876543210l);
		JavaConstructor s2 = new JavaConstructor(102, "Aman", 22, 8765432109l);
		JavaConstructor s3 = new JavaConstructor(103, "Raman", 24, 7654321098l);
		JavaConstructor s4 = new JavaConstructor(104, "Piyush", 23, 9876543021l);
		JavaConstructor s5 = new JavaConstructor(105, "Dhananjay", 22, 9359721907l);

		System.out.println(s3.sId);
		System.out.println(s1.sId);
	}

}
