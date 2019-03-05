
public class Main {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.setAccountNumber(123);
		account.setBalance(4000);
		account.setCustomerName("Austin");
		
		account.deposit(120);
		
		account.withDrawal(20);
		
		System.out.println(account.getBalance());
		System.out.println(account.withDrawal(100));
		System.out.println(account.getCustomerName());
		
	}

}
