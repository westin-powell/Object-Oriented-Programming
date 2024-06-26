import java.sql.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualIntrestRate = 0;
	private Date dateCreated;
	Account() {
	}
	Account(int id, double balance, double annualIntrestRate, Date dateCreated) {
		this.id = id;
		this.balance = balance;
		this.annualIntrestRate = annualIntrestRate;
		this.dateCreated = dateCreated;
	}
	public  int getId() {
		return id;
	}
	public int setId(int id) {
		this.id = id;
		return this.id;
	}
	public double getBalance() {
		return balance;
	}
	public double setBalance(double balance) {
		this.balance = balance;
		return this.balance;
	}
	public double getAnnualIntrestRate() {
		return annualIntrestRate;
	}
	public double setAnnualIntrestRate(double annualIntrestRate) {
		this.annualIntrestRate = annualIntrestRate;
		return this.annualIntrestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyIntrestRate() {
		double monthlyIntrestRate = annualIntrestRate / 12;
		return monthlyIntrestRate;
	}
	public double getmonthlyIntrest() {
		double monthlyIntrest = balance * (annualIntrestRate / 12);
		return monthlyIntrest;
	}
	public double withdraw(double amount) {
		balance -= amount;
		return balance;
	}
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
}
