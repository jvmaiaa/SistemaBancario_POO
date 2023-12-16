package entities;

public class PersonalAccount extends PrincipalAccount{

	private Integer cpf;
	private Double tax;
	private Integer age;
	
	public PersonalAccount() {
		super();
	}

	public PersonalAccount(String name, Integer accountNumber, Double balance, Double withdrawLimit, Integer cpf,
			Double tax, Integer age) {
		super(name, accountNumber, balance, withdrawLimit);
		this.cpf = cpf;
		this.tax = tax;
		this.age = age;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
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
