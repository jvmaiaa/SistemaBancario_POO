package model.entities;

import model.entities.enums.LevelAccount;

public final class PersonalAccount extends PrincipalAccount{

	private String cpf;
	private Integer age;
	private LevelAccount levelAccount;
	
	public PersonalAccount() {
		super();
	}
	
	public PersonalAccount(String name, Integer accountNumber, Double withdrawLimit, String cpf,
			Integer age, LevelAccount levelAccount) {
		super(name, accountNumber, withdrawLimit);
		if (withdrawLimit <= 5.00) {
			throw new IllegalArgumentException("The value needs be greather than $5.00");
		}
		this.cpf = cpf;
		this.age = age;
		this.levelAccount = levelAccount;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public LevelAccount getLevelAccount() {
		return levelAccount;
	}

	public void setLevelAccount(LevelAccount levelAccount) {
		this.levelAccount = levelAccount;
	}

	@Override
	public final void withdraw(Double amount) {
		super.deposit(amount);
		balance -= amount * 0.97;
	}
	
	@Override
	public final void deposit(Double amount) {
		super.deposit(amount);
	}
	
	@Override
	public String toString() {
		return super.toString() + "CPF: " + cpf + "\nAge: " + age + "\nLevel: " + levelAccount;
	}
	
}
