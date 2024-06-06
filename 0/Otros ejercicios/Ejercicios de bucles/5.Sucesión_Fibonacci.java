/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SUCESION_FIBONACCI.java."

import java.io.*;

public class sucesion_fibonacci {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double i;
		double n1;
		double n2;
		double num;
		double res;
		System.out.println("¿Cuántos números quieres mostrar de la sucesión de Fibonacci?");
		num = Double.parseDouble(bufEntrada.readLine());
		n1 = 0;
		n2 = 1;
		for (i=1; i<=num; ++i) {
			System.out.print(n1+" ");
			res = n1+n2;
			n1 = n2;
			n2 = res;
		}
	}


}

