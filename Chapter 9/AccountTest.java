import java.util.Date;

class AccountTest {

	public static void main(String[] args) {
		int id = 1122;
		double balance = 20000;
		double annualIntrestRate = 4.5;
		Date date = new Date();
		Account account = new Account(id, balance, annualIntrestRate, date);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println(account.getBalance());
		System.out.println(account.getMonthlyIntrest());
		System.out.print(account.getDateCreated());
	}
	
}
