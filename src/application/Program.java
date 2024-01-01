package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.BusinessAccount;
import model.entities.PersonalAccount;
import model.entities.PrincipalAccount;
import model.entities.enums.LevelAccount;

public class Program {

	public static void main(String[] args) {
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
		
		try { 
			List<PrincipalAccount> contas = new ArrayList<>();
			
			System.out.print("Enter how many accounts you want to add:");
			int quantityOfAccounts = scan.nextInt();
			for (int i = 0; i < quantityOfAccounts; i++) {
				scan.nextLine();
				System.out.println("Account Data #" + (i+1) + "\n");
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
				scan.nextLine();
				PrincipalAccount pacc = null;
				
			if (resp == '1') {
				System.out.print("Enter your CPF: ");
				String cpf = scan.nextLine();
				System.out.print("Enter your age: ");
				int age = scan.nextInt();
				System.out.print("Enter your account level (BASIC / INTERMEDIARY / PREMIUM ): ");
				LevelAccount level = LevelAccount.valueOf(scan.next());
				pacc = new PersonalAccount(name, accountNumber, withdrawLimit, cpf, age, level);
			}
			else if (resp == '2'){
				System.out.print("Enter your CNPJ:");
				String cnpj = scan.nextLine();
				System.out.print("Enter the year your company opened (dd/MM/yyyy): ");
				Date oppeningYear = sdf.parse(scan.next());
				pacc = new BusinessAccount(name, accountNumber, withdrawLimit, cnpj, oppeningYear);
			}
			else {
				System.out.print("Invalid Option! ");
			}
			if (pacc != null) {
				pacc.deposit(deposit);
				contas.add(pacc);
			}
			deposit = 0.0;
			System.out.println();
			}
			int j = 0;
			for (PrincipalAccount acc : contas) {
				System.out.println("Account Data #" + (j+1) + "\n");
				System.out.println(acc);
				j++;
			}
		}
		catch (ParseException e) {
			System.out.println("Invalid date format! Enter a date in the format (dd/MM/yyyy).");
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Error: Invalid input! Enter a valid value.");
		}
		scan.close();
	}

}
