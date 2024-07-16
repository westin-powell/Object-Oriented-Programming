import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

class polymorphism_real_worldTest {

	public static void main(String[] args) {
		int id = 1;
		double balance = 1000;
		double annualIntrestRate = 4;
		Date date = new Date();
		double limit = 100;
		Account account = new Account(id, balance, annualIntrestRate, date);
		checkingAccounts checkingAccount = new checkingAccounts(id, balance, annualIntrestRate, date, limit);
		savingAccounts savingAccount = new savingAccounts(id, balance, annualIntrestRate, date);
		System.out.println(account.toString());
		System.out.println("\n" + checkingAccount.toString());
		System.out.println("\n" + savingAccount.toString());
	}

}
