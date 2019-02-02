public class Employee extends Entity{
		
	private int sellCount;
	private String password;
	
	public Employee(String name, String addres, int sellCount, double balance, String password) {
		super(name, addres, balance);
		this.sellCount = sellCount;
		this.password = password;
	}


	public void info() {
		System.out.println("------------------");
		System.out.println("Employee: " + getName());
		System.out.println("Address: " + getAddres());
		System.out.println("Sell: " + sellCount + " car");
		System.out.println("Balance: $" + getBalance());

	}
	
	public static void addOneToSellcount(Employee emp) {
		emp.sellCount++;
	}
	

}