package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.BusinessAccount;
import entities.PersonalAccount;
import entities.PrincipalAccount;
import entities.enums.LevelAccount;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		/*
		PrincipalAccount pacc = new PrincipalAccount();
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		pacc.setName(name);
		System.out.print("Enter your account number: ");
		int number = scan.nextInt();
		pacc.setAccountNumber(number);
		System.out.print("Enter the amount to deposit into your account:");
		double deposit = scan.nextDouble();
		pacc.deposit(deposit);
		System.out.print("Enter the limit to your withdraw (It needs to be greather than $5.00): ");
		double withdrawLimit = scan.nextDouble();
		pacc.setWithdrawLimit(withdrawLimit);
		*/
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		System.out.print("Enter your account number: ");
		int accountNumber = scan.nextInt();
		System.out.print("Enter the amount to deposit into your account: ");
		double deposit = scan.nextDouble();
		System.out.print("Enter the limit to your withdraw (It needs to be greather than $5.00): ");
		double withdrawLimit = scan.nextDouble();
		System.out.print("What type of your account (Personal Account - 1 / Business Account - 2): ");
		char resp = scan.next().charAt(0);
		PrincipalAccount pacc = null;
		if (resp == '1') {
			System.out.print("Enter your CPF: ");
			String cpf = scan.nextLine();
			System.out.print("Enter your account level (BASIC / INTERMEDIARY / PREMIUM ): ");
			LevelAccount level = LevelAccount.valueOf(scan.next());
			System.out.print("Enter your age: ");
			int age = scan.nextInt();
			 pacc = new PersonalAccount(name, accountNumber, withdrawLimit, cpf, age, level);
		}
		else if (resp == '2'){
			System.out.print("Enter your CNPJ:");
			String cnpj = scan.nextLine();
			System.out.print("Enter the year your company opened: ");
			Date oppeningYear = sdf.parse(scan.next());
			pacc = new BusinessAccount(name, accountNumber, withdrawLimit, cnpj, oppeningYear);
		}
		else {
			System.out.print("Invalid account type! ");
		}
		pacc.deposit(deposit);
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.print(pacc);
		
		scan.close();
	}

}
