package model.entities;

public class PrincipalAccount {
	
	private String name;
	private Integer accountNumber;
	protected Double balance;
	private Double withdrawLimit;
	
	public PrincipalAccount(){
	}

	public PrincipalAccount(String name, Integer accountNumber, Double withdrawLimit) {
		if (withdrawLimit <= 5.00) {
			throw new IllegalArgumentException("The value needs be greather than $5.00");
		}
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = 0.0;
		this.withdrawLimit = withdrawLimit;
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
		if (withdrawLimit <= 5.00) {
			throw new IllegalArgumentException("The value needs be greather than $5.00");
		}
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw(Double amount) {
		if (amount > withdrawLimit) {
			throw new IllegalArgumentException("The withdraw amount must be less than the withdraw limit! ");
		}
		if (amount <= 0) {
			throw new IllegalArgumentException("The withdraw amount must be greather than $0");
		}
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		if (amount <= 0.0) {
			throw new IllegalArgumentException("The deposit amount must be greather than $0");
		}
		balance += amount;
	}

	public void transfer(PrincipalAccount sourceAccount, PrincipalAccount destinationAccount, Double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("The transfer value must be less than or equal to the account value!");
		}
		sourceAccount.balance -= amount;
		destinationAccount.balance += amount;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAccountNumber: " + accountNumber
				+ "\nBalance: $" + String.format("%.2f", balance) + "\n";
	}
	
}
