/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "RECTANGULO.java."

import java.io.*;

public class rectangulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		double ancho;
		double columna;
		int eleccion;
		double fila;
		do {
			System.out.println("Elige una opción");
			System.out.println("1.- Introduzca la dimensión de la base del rectángulo.");
			System.out.println("2.- Introduzca la dimensión de la altura del rectángulo.");
			System.out.println("3.- Pinta el rectángulo.");
			System.out.println("4.- Intercambia base por altura.");
			System.out.println("5.- Salir.");
			eleccion = Integer.parseInt(bufEntrada.readLine());
			switch (eleccion) {
			case 1:
				System.out.println("1.- Introduzca la dimensión de la base del rectángulo.");
				ancho = Double.parseDouble(bufEntrada.readLine());
				break;
			case 2:
				System.out.println("2.- Introduzca la dimensión de la altura del rectángulo.");
				altura = Double.parseDouble(bufEntrada.readLine());
				break;
			case 3:
				for (fila=1; fila<=altura; ++fila) {
					for (columna=1; columna<=ancho; ++columna) {
						System.out.print("* ");
					}
					System.out.println(" ");
				}
				break;
			case 4:
				break;
			case 5:
				System.out.println("Saliendo.");
				break;
			default:
				System.out.println("No sé qué operación quieres hacer");
			}
		} while (eleccion!=5);
	}


}

