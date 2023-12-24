package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class BusinessAccount extends PrincipalAccount {
	// SimpleDateFormat is static, so it won't be instantiated multiple times
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String cnpj;
	private Date openningYear;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(String name, Integer accountNumber, Double withdrawLimit, String cnpj,
			Date openningYear) {
		super(name, accountNumber, withdrawLimit);
		if (withdrawLimit <= 5.00) {
			throw new IllegalArgumentException("The value needs be greather than $5.00");
		}
		this.cnpj = cnpj;
		this.openningYear = openningYear;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getOpenningYear() {
		return openningYear;
	}

	public void setOpenningYear(Date openningYear) {
		this.openningYear = openningYear;
	}

	@Override
	public final void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= amount * 0.95;  
	}
	
	@Override 
	public final void deposit(Double amount) {
		super.deposit(amount);
	}
	
	@Override
	public String toString() {
		return super.toString() + "CNPJ: " + cnpj + "\nOpening Year: " + sdf.format(openningYear);
	}
}
