import java.util.Date;

class Account {
	private int id = 0;
	private double balance = 0;
	private double annualIntrestRate = 0;
	private Date dateCreated;
	public Account() {
	}
	public Account(int id, double balance, double annualIntrestRate, Date dateCreated) {
		this.id = id;
		this.balance = balance;
		this.annualIntrestRate = annualIntrestRate;
		this.dateCreated = dateCreated;
	}
	public int getId() {
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
	public double getMonthlyIntrest() {
		double monthlyIntrest = balance * ((annualIntrestRate / 100) / 12);
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
	public String toString() {
		return "id: " + id + "\nbalance: " + balance + " annual intrest rate: " + annualIntrestRate + "\ndate created: " + dateCreated;
	}
}
class checkingAccounts extends Account {
	private int id = 0;
	private double balance = 0;
	private double annualIntrestRate = 0;
	private Date dateCreated;
	private double limit = 0;
	public checkingAccounts() {
	}
	public checkingAccounts(int id, double balance, double annualIntrestRate, Date dateCreated, double limit) {
		this.id = id;
		this.balance = balance;
		this.annualIntrestRate = annualIntrestRate;
		this.dateCreated = dateCreated;
		this.limit = limit;
	}
	public double withdraw(double amount) {
		if(amount < limit) {
			balance -= amount;
			return balance;
		}else {
			System.out.println("failed to withdraw");
			return balance;
		}
	}
	public int getId() {
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
	public double getMonthlyIntrest() {
		double monthlyIntrest = balance * ((annualIntrestRate / 100) / 12);
		return monthlyIntrest;
	}
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	public String toString() {
		return "id: " + id + "\nbalance: " + balance + " annual intrest rate: " + annualIntrestRate + " withdraw limit: " + limit + "\ndate created: " + dateCreated;
	}
}
class savingAccounts extends Account {
	private int id = 0;
	private double balance = 0;
	private double annualIntrestRate = 0;
	private Date dateCreated;
	public savingAccounts() {
	}
	public savingAccounts(int id, double balance, double annualIntrestRate, Date dateCreated) {
		this.id = id;
		this.balance = balance;
		this.annualIntrestRate = annualIntrestRate;
		this.dateCreated = dateCreated;
	}
	public int getId() {
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
	public double getMonthlyIntrest() {
		double monthlyIntrest = balance * ((annualIntrestRate / 100) / 12);
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
	public String toString() {
		return "id: " + id + "\nbalance: " + balance + " annual intrest rate: " + annualIntrestRate + "\ndate created: " + dateCreated;
	}
}