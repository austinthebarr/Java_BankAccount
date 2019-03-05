
public class BankAccount {
	private int accountNumber;
	private int balance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNumber;
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(int balance) {
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
	
	public int getBalance() {
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

	public void deposit(int funds) {
		int balance = getBalance();
		setBalance(balance + funds);	
	}
	
	public String withDrawal(int amount) {
		int balance = getBalance();
		if(balance < amount) {
			return "innsufficent Funds";
		}
		setBalance(balance - amount);
		
		return "Success your balance is: " + getBalance();
	}

	

}
