package SISTEMADECONTROL;

import java.util.Scanner;

public class Ej_Compartido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		double base = 0;
		double altura = 0;
		System.out.println("Introduce la altura");
		altura = in.nextDouble();
		System.out.println("Introduce la base: ");
		base = in.nextDouble();
		System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));

	}

	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
}
