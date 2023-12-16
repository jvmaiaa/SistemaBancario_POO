package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrincipalAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
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
		int number = scan.nextInt();
		System.out.print("Enter the amount to deposit into your account:");
		double deposit = scan.nextDouble();
		System.out.print("Enter the limit to your withdraw (It needs to be greather than $5.00): ");
		double withdrawLimit = scan.nextDouble();
		PrincipalAccount pacc = new PrincipalAccount(name, number, withdrawLimit);
		pacc.deposit(deposit);
		
		System.out.println();
		System.out.println("Account Data:");
		System.out.print(pacc);
		
		scan.close();
	}

}
