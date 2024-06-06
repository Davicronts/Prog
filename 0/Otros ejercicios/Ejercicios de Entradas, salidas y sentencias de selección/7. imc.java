/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "IMC.java."

import java.io.*;
import java.math.*;

public class imc {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double est;
		double pes;
		double resultado;
		System.out.println("Introduce tu estatura (m):");
		est = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Introduce tu peso (kg):");
		pes = Double.parseDouble(bufEntrada.readLine());
		resultado = pes/(Math.pow(est, 2));
		if (resultado<18.5) {
			System.out.println("Tu IMC es de: "+resultado+", tienes un peso inferior al normal.");
		} else {
			if (resultado>=18.5 && resultado<=24.99) {
				System.out.println("Tu IMC es de: "+resultado+", tienes un peso normal.");
			} else {
				if (resultado>=25 && resultado<=29.99) {
					System.out.println("Tu IMC es de: "+resultado+", tienes un peso superior al normal.");
				} else {
					System.out.println("Tu IMC es de: "+resultado+", tienes obesidad.");
				}
			}
		}
	}


}

