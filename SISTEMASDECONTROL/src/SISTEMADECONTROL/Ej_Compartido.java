package SISTEMADECONTROL;

import java.util.Scanner;

public class Ej_Compartido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		// CASO TRIÁNGULO
		double base = 0;
		double altura = 0;
		System.out.println("CASO TRIÁNGULO");
		System.out.println("Introduce la altura");
		altura = in.nextDouble();
		System.out.println("Introduce la base: ");
		base = in.nextDouble();
		System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));
		System.out.println("\n");

		// CASO CIRCUNFERENCIA
		System.out.println("CASO CIRCUNFERENCIA");
		double radio = 0;
		System.out.println("Introduce el radio: ");
		radio = in.nextDouble();
		// Calcular el área y el perímetro
		System.out.println("El área de la circunferencia es: " + calcularAreaCircunferenciaL(radio));
		System.out.println("El perímetro de la circunferencia es: " + calcularPerimetroCircunferenciaL(radio));

	}

	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}

	public static double calcularAreaCircunferenciaL(double radio) {
		return 3.14 * radio * radio;

	}

	public static double calcularPerimetroCircunferenciaL(double radio) {
		return 2 * 3.14 * radio;

	}
}
