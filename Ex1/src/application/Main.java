package application;

import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.width = teclado.nextDouble();
		rectangle.height = teclado.nextDouble();
		System.out.println("AREA = " + rectangle.Area());
		System.out.println("PERIMETER = " + rectangle.Perimeter());
		System.out.println("DIAGONAL = " + rectangle.Diagonal());
	}

}
