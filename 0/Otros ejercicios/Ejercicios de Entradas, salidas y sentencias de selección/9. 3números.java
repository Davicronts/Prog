/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TRESNUMEROS.java."

import java.io.*;

public class tresnumeros {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String num1;
		String num2;
		String num3;
		System.out.println("Introduce un número:");
		num1 = bufEntrada.readLine();
		System.out.println("Introduce un segundo número:");
		num2 = bufEntrada.readLine();
		System.out.println("Introduce un tercer número:");
		num3 = bufEntrada.readLine();
		if (num1<=num2) {
			if (num2<=num3) {
				System.out.println("Los números ordenados serían: "+num1+", "+num2+" y "+num3+".");
			} else {
				if (num1<=num3) {
					System.out.println("Los números ordenados serían: "+num1+", "+num3+" y "+num2+".");
				} else {
					System.out.println("Los números ordenados serían: "+num3+", "+num1+" y "+num2+".");
				}
			}
		} else {
			if (num3<=num2) {
				System.out.println("Los números ordenados serían: "+num3+", "+num2+" y "+num1+".");
			} else {
				if (num1<=num3) {
					System.out.println("Los números ordenados serían: "+num2+", "+num1+" y "+num3+".");
				} else {
					System.out.println("Los números ordenados serían: "+num2+", "+num3+" y "+num1+".");
				}
			}
		}
	}


}

