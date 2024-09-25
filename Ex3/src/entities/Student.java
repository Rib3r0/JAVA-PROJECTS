package entities;

public class Student {
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double getFinalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public double missingPoints() {
		return 60 - getFinalGrade();
	}
	
	
}
