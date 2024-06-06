/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ROMBO.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. Técnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos actúa como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) actúa como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deberán modificarse algunos métodos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepción. Si una función A es
// invocada por otra B, B también debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el código generado automáticamante: las funciones que realizan lecturas
// directamente incluyen el código que indica que pueden generar dicha excepción, pero las que
// lo hacen indirectamente (invocando a otras que sí lo hacen), puede que no, y deberán ser
// corregidas manualmente.

import java.io.*;

public class rombo {

	public static void piramide(double altura) {
		double espacios;
		double estrellas;
		double fila;
		for (fila=1; fila<=altura; ++fila) {
			for (espacios=1; espacios<=altura-fila; ++espacios) {
				System.out.print(" ");
			}
			for (estrellas=1; estrellas<=2*fila-1; ++estrellas) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void piramide_invertida(double altura) {
		double espacios;
		double estrellas;
		double fila;
		for (fila=altura; fila>=1; --fila) {
			for (espacios=1; espacios<=altura-fila; ++espacios) {
				System.out.print(" ");
			}
			for (estrellas=1; estrellas<=2*fila-1; ++estrellas) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int altura;
		System.out.print("¿De cuántos pisos quieres el rombo?");
		altura = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Piramide");
	}


}

