/********************************************************
*                     Account                           *
*-------------------------------------------------------*
* -id: int                                              *
* -balance: double                                      *
* -annualInterestRate: double                           *
* ---------------------------                           *
* -dateCreated: String                                  *
* +Account()                                            *
* +Account(newid: int, newBalance: double)              *
* +setId(newId: int)                                    *
* +setBalance(newBalance: double)                       *
* +setAnnualInterestRate(newAnnualInterestRate: double) *
* +getId(): int                                         *
* +getBalance(): double                                 *
* +getAnnualInterestRate(): double                      *
* +getDateCreated(): String                             *
* +getMonthlyInterestRate(): double                     *
* +getMonthlyInterest(): double                         *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
********************************************************/



import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account() {
		id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
	}
	Account(int id) {
		this.id = id;
		this.balance = 100;
		dateCreated = new Date();
	}
	
	public Date getDate() {
		return dateCreated;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public double withdraw(double withdraw) {
		if(balance >= withdraw) {
			return this.balance = this.balance - withdraw;
			
		} else {
			return -1;
		}
	}
	
	public double deposit(double deposit) {
		return this.balance = this.balance + deposit;
		
	}
	
	public double getMonthlyInterestRate() {
		return (this.annualInterestRate * 100) / 12;
	}
	
	public double getMonthlyInterest(double monthlyInterestRate) {
		return this.balance * monthlyInterestRate;
	}
	
}