package Application;

import java.util.Scanner;

import Entities.Account;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Account account = new Account();
		
		System.out.print("Enter account number: ");
		account.setNumber(teclado.nextLine());
		System.out.print("Enter account holder:");
		account.setHolder(teclado.nextLine());
		System.out.print("Is there an initial deposit (y/n)? ");
		if(teclado.next().toUpperCase().charAt(0) == 'Y') {
			System.out.print("Enter initial deposit value: ");
			account.deposit(teclado.nextDouble());
		}
		System.out.println("Account data:");
		System.out.println(account);

		System.out.print("Enter a deposit value: ");
		account.deposit(teclado.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(teclado.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		teclado.close();
	}

}
