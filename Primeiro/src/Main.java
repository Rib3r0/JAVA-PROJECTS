import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = teclado.nextDouble();
		x.b = teclado.nextDouble();
		x.b = teclado.nextDouble();

		System.out.println("Enter the measures of triangle Y:");
		y.a = teclado.nextDouble();
		y.b = teclado.nextDouble();
		y.c = teclado.nextDouble();
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}else if (areaX < areaY) {
			System.out.println("Larger area: Y");
		}
		else {
			System.out.println("Larger area: Both");
		}
		
		
		teclado.close();
		
//		double xA, xB, xC, yA, yB, yC;
//		
//		System.out.println("Enter the measures of triangle X:");
//		xA = teclado.nextDouble();
//		xB = teclado.nextDouble();
//		xC = teclado.nextDouble();
//
//		System.out.println("Enter the measures of triangle Y:");
//		yA = teclado.nextDouble();
//		yB = teclado.nextDouble();
//		yC = teclado.nextDouble();
//		
//		
//		double p = (xA + xB + xC) / 2.0;
//		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
//		
//		p = (yA + yB + yC) / 2.0;
//		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
//		
//		System.out.printf("Triangle X area: %.4f%n", areaX);
//		System.out.printf("Triangle Y area: %.4f%n", areaY);
//		
//		
//		if (areaX > areaY) {
//			System.out.println("Larger area: X");
//		}else if (areaX < areaY) {
//			System.out.println("Larger area: Y");
//		}
//		else {
//			System.out.println("Larger area: Both");
//		}
	}

}