/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SUMA_MEDIA.java."

import java.io.*;

public class suma_media {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double i;
		double n;
		double num;
		double numeros_a_introducir;
		double res;
		System.out.println("�Cu�ntos n�meros quieres introducir?");
		numeros_a_introducir = Double.parseDouble(bufEntrada.readLine());
		if (numeros_a_introducir<=1) {
			System.out.println("�Tienes que introducir m�s de 1 n�mero!");
		} else {
			i = 1;
			num = 0;
			while (i<=numeros_a_introducir) {
				System.out.println("Introduce el n�mero:");
				n = Double.parseDouble(bufEntrada.readLine());
				num = num+n;
				i = i+1;
			}
			res = num/numeros_a_introducir;
			System.out.println("La media de los "+numeros_a_introducir+" n�meros es: "+res);
		}
	}


}

