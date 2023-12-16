package entities;

public class PrincipalAccount {
	
	private String name;
	private Integer accountNumber;
	private Double balance;
	private Double withdrawLimit;
	
	public PrincipalAccount(){
	}

	public PrincipalAccount(String name, Integer accountNumber,Double balance, Double withdrawLimit) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public PrincipalAccount(String name, Integer accountNumber, Double withdrawLimit) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.withdrawLimit = withdrawLimit;
		// this.balance is optional, because the attribute when not mentioned, starts with 0
		this.balance = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(Double amount) {
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public String toString() {
		return "Name: " + name + "\nAccountNumber: " + accountNumber
				+ "\nBalance: $" + String.format("%.2f", balance);
	}
	
}