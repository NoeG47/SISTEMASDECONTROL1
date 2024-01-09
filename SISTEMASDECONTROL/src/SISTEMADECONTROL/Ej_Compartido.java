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
		System.out.println("\n");

		// CASO CILINDRO :)
		System.out.println("CASO CILINDRO");
		double radioCilindro = 0;
		double alturaCilindro = 0;
		// Calcular el área del cilindro
		System.out.println("Introduce el radio del cilindro: ");
		radioCilindro = in.nextDouble();
		System.out.println("Introduce la altura del cilindro: ");
		alturaCilindro = in.nextDouble();
		System.out.println("El área de la cilindro es: " + calcularAreaCilindroN(radioCilindro, alturaCilindro));
		System.out.println("\n");

		// CASO RECTÁNGULO
		System.out.println("CASO RECTÁNGULO");
		double longitud = 0;
		double ancho = 0;
		// Calcular el área de un rectángulo
		System.out.print("Ingrese la longitud del rectángulo: ");
		longitud = in.nextDouble();
		System.out.print("Ingrese el ancho del rectángulo: ");
		ancho = in.nextDouble();
		System.out.println("El área de un rectángulo es: " + calcularAreaRectanguloL(longitud, ancho));
		System.out.println("\n");

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

	public static double calcularAreaCilindroN(double radioCilindro, double alturaCilindro) {
		double pi = 3.14;

		double areaBase = pi * radioCilindro * radioCilindro;

		double areaLateral = 2 * pi * radioCilindro * alturaCilindro;

		double areaTotal = 2 * areaBase + areaLateral;

		return areaTotal;

	}

	public static double calcularAreaRectanguloL(double longitud, double ancho) {
		return longitud * ancho;
	}

	
}
