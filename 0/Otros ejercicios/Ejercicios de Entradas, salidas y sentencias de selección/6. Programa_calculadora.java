/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PROGRAMA_CALCULADORA.java."

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

public class programa_calculadora {

	public static double suma(String sumando1, String sumando2) {
		double resultado;
		resultado = sumando1+sumando2;
		return resultado;
	}

	public static double resta(double minuendo, double sustraendo) {
		double resultado;
		resultado = minuendo-sustraendo;
		return resultado;
	}

	public static double multiplicacion(double multiplicando1, double multiplicando2) {
		double resultado;
		resultado = multiplicando1*multiplicando2;
		return resultado;
	}

	public static double division(double dividendo1, double divisor2) {
		double resultado;
		resultado = dividendo1/divisor2;
		return resultado;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int eleccion;
		String num1;
		String num2;
		String res;
		do {
			System.out.println("Introduce un número:");
			num1 = bufEntrada.readLine();
			System.out.println("Introduce un segundo número:");
			num2 = bufEntrada.readLine();
			System.out.println("Elige una opción");
			System.out.println("1.- Suma");
			System.out.println("2.- Resta");
			System.out.println("3.- Multiplicación");
			System.out.println("4.- División");
			eleccion = Integer.parseInt(bufEntrada.readLine());
			switch (eleccion) {
			case 1:
				res = suma(num1, num2);
				System.out.println("La suma de "+num1+" + "+num2+" es "+res);
				break;
			case 2:
				res = resta(num1, num2);
				System.out.println("La resta de "+num1+" - "+num2+" es "+res);
				break;
			case 3:
				res = multiplicacion(num1, num2);
				System.out.println("La multiplicación de "+num1+" * "+num2+" es "+res);
				break;
			case 4:
				res = division(num1, num2);
				System.out.println("La división de "+num1+" : "+num2+" es "+res);
				break;
			default:
				System.out.println("No sé qué operación quieres hacer");
			}
		} while (!(eleccion==1 || eleccion==2 || eleccion==3 || eleccion==4));
	}


}

