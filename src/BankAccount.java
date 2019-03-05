
public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNumber;
	
	public BankAccount() {
		this(123, 0.00, "Jane Doe", "janedoe@email.com", "(999) 999-9999");
		System.out.println("Empty Constructor");
	}
	
	public BankAccount(int accountNum, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
		this.accountNumber = accountNum;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getCustomerEmail() {
		return this.customerEmail;
	}
	
	public String getCustomerPhoneNumber() {
		return this.customerPhoneNumber;
	}

	public String deposit(double funds) {
		this.balance += funds;	
		return "Success your balance is now: " + this.balance;
	}
	
	public void withDrawal(double amount) {
	System.out.println(this.balance);
		if(0 > this.balance - amount) {
			System.out.println("innsufficent Funds");
		} else {
			this.balance -= amount;
			System.out.println(this.balance);
			System.out.println("Success your balance is: " + this.balance);
		}
	}

	

}
