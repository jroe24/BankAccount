import java.lang.Math;

public class BankAccount {
	private int accountNumber = setAccountNumber();
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	public static int numberOfAccounts = 0;
	public static double moneyInAccounts = 0;
	
	public static int setAccountNumber() {
		numberOfAccounts ++;
        return (int) (Math.random() * 2000000000) + 1000000000;
	}
	
	public double getCheckingBalance() {
		System.out.println("Your checking account balance is currently: " + checkingBalance );
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		System.out.println("Your savings account balance is currently: " + savingsBalance );
		return savingsBalance;
	}
	
	public void depositChecking(double depositMoney) {
		this.checkingBalance = this.checkingBalance + depositMoney;
		moneyInAccounts = moneyInAccounts + depositMoney;
	}
	
	public void depositSavings(double depositMoney) {
		this.savingsBalance = this.savingsBalance + depositMoney;
		moneyInAccounts = moneyInAccounts + depositMoney;
	}
	
	public void withdrawSavings(double withdrawMoney) {
		this.savingsBalance = this.savingsBalance - withdrawMoney;
		moneyInAccounts = moneyInAccounts - withdrawMoney;
	}
	
	public void withdrawCheckings(double withdrawMoney) {
		this.checkingBalance = this.checkingBalance - withdrawMoney;
		moneyInAccounts = moneyInAccounts - withdrawMoney;
	}
	
	public void getAccountNumber() {
		System.out.println("Your account number is: " + this.accountNumber );
	}
	
	public void getNumberOfAccounts() {
		System.out.println("The number of accounts is: " + numberOfAccounts );
	}

	public void getMoneyInAccounts() {
		System.out.println("Total money in all accounts is: " + moneyInAccounts );
	}
	
}