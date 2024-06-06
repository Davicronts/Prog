/* Este codigo ha sido generado por el modulo psexport 20230113-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "TIENDA.java."

import java.io.*;

public class tienda {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double desc;
		double precio_con_desc;
		double precio_sin_desc;
		double zapatos;
		System.out.println("¿Cuántos zapatos desea comprar?");
		zapatos = Double.parseDouble(bufEntrada.readLine());
		if (zapatos<10) {
			precio_sin_desc = 80*zapatos;
			System.out.println("Tu compra tendrá un precio total de "+precio_sin_desc+" euros.");
		} else {
			if (zapatos>=10 && zapatos<20) {
				desc = (zapatos*10)/100;
				precio_sin_desc = 80*zapatos;
				precio_con_desc = precio_sin_desc-desc;
				System.out.println("Tu compra tendrá un descuento de "+desc+" euros, siendo en total "+precio_con_desc+" euros.");
			} else {
				if (zapatos>=20 && zapatos<30) {
					desc = (zapatos*20)/100;
					precio_sin_desc = 80*zapatos;
					precio_con_desc = precio_sin_desc-desc;
					System.out.println("Tu compra tendrá un descuento de "+desc+" euros, siendo en total "+precio_con_desc+" euros.");
				} else {
					if (zapatos>=30) {
						desc = (zapatos*40)/100;
						precio_sin_desc = 80*zapatos;
						precio_con_desc = precio_sin_desc-desc;
						System.out.println("Tu compra tendrá un descuento de "+desc+" euros, siendo en total "+precio_con_desc+" euros.");
					} else {
						System.out.println("No entendí lo que me dijiste.");
					}
				}
			}
		}
	}


}

