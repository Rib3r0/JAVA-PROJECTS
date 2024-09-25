package application;

import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = teclado.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = teclado.nextDouble();
		System.out.print("Tax: ");
		employee.tax = teclado.nextDouble();
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double porcentage = teclado.nextDouble();
		employee.IncreaseSalary(porcentage);
		System.out.println();
		System.out.println("Updated data: "+ employee);

		teclado.close();
	}

}
