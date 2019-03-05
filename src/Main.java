
public class Main {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		BankAccount austinAccount = new BankAccount(123, 5000.37, "Austin", "austin@gmail.com","1111111");
		account.deposit(200.12);
		account.withDrawal(24.42);
		
		System.out.println(austinAccount.getBalance());
		
	}

}
