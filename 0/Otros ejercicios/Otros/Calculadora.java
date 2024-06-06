/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CALCULADORA.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. T�cnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos act�a como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) act�a como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deber�n modificarse algunos m�todos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepci�n. Si una funci�n A es
// invocada por otra B, B tambi�n debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el c�digo generado autom�ticamante: las funciones que realizan lecturas
// directamente incluyen el c�digo que indica que pueden generar dicha excepci�n, pero las que
// lo hacen indirectamente (invocando a otras que s� lo hacen), puede que no, y deber�n ser
// corregidas manualmente.

import java.io.*;

public class calculadora {

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
		String div1;
		String div2;
		int eleccion;
		String min;
		String mul1;
		String mul2;
		String res;
		String sum1;
		String sum2;
		String sus;
		System.out.println("Bienvenido a mi calculadora");
		do {
			System.out.println("Elige una opci�n");
			System.out.println("1.- Suma");
			System.out.println("2.- Resta");
			System.out.println("3.- Multiplicaci�n");
			System.out.println("4.- Divisi�n");
			eleccion = Integer.parseInt(bufEntrada.readLine());
			switch (eleccion) {
			case 1:
				System.out.println("Introduce el primer sumando:");
				sum1 = bufEntrada.readLine();
				System.out.println("Introduce el segundo sumando:");
				sum2 = bufEntrada.readLine();
				res = suma(sum1, sum2);
				System.out.println("La suma de "+sum1+" + "+sum2+" es "+res);
				break;
			case 2:
				System.out.println("Introduce el primer minuendo:");
				min = bufEntrada.readLine();
				System.out.println("Introduce el segundo sustraendo:");
				sus = bufEntrada.readLine();
				res = resta(min, sus);
				System.out.println("La resta de "+min+" - "+sus+" es "+res);
				break;
			case 3:
				System.out.println("Introduce el primer multiplicando:");
				mul1 = bufEntrada.readLine();
				System.out.println("Introduce el segundo multiplicando:");
				mul2 = bufEntrada.readLine();
				res = multiplicacion(mul1, mul2);
				System.out.println("La multiplicaci�n de "+mul1+" * "+mul2+" es "+res);
				break;
			case 4:
				System.out.println("Introduce el dividendo:");
				div1 = bufEntrada.readLine();
				System.out.println("Introduce el divisor:");
				div2 = bufEntrada.readLine();
				res = division(div1, div2);
				System.out.println("La divisi�n de "+div1+" : "+div2+" es "+res);
				break;
			default:
				System.out.println("No s� qu� operaci�n quieres hacer");
			}
		} while (!(eleccion==1 || eleccion==2 || eleccion==3 || eleccion==4));
	}


}

