package entities;

public class BusinessAccount extends PrincipalAccount {
	
	private Integer cnpj;
	private Double enterpriseTax;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(String name, Integer accountNumber, Double balance, Double withdrawLimit, Integer cnpj,
			Double enterpriseTax) {
		super(name, accountNumber, balance, withdrawLimit);
		this.cnpj = cnpj;
		this.enterpriseTax = enterpriseTax;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public Double getEnterpriseTax() {
		return enterpriseTax;
	}

	public void setEnterpriseTax(Double enterpriseTax) {
		this.enterpriseTax = enterpriseTax;
	}
	
	@Override
	public void withdraw(Double amount) {
		// codigo
	}
	
	@Override 
	public void deposit(Double amount) {
		// codigo
	}
}
