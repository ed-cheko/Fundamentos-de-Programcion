/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "BONODESEMPE�O_ECK.java."

import java.io.*;

public class BONODESEMPENO_ECK {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int bono;
		int puntos;
		int salario;
		bono=0;
		// Definicion de variables
		// DAtos de Entrada
		System.out.println("Escribir Salario minimo: ");
		salario = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Cantidad de puntos: ");
		puntos = Integer.parseInt(bufEntrada.readLine());
		// Preceso
		if (puntos>=50 && puntos<=100) {
			bono = (int) Math.round(salario*0.10);
		} else {
			if (puntos>=101 && puntos<=150) {
				bono = (int) Math.round(salario*0.50);
			} else {
				if (puntos>=151) {
					bono = (int) Math.round(salario*1.0);
				}
			}
		}
		// Datos de  Salida
		System.out.println("El monto del bono es: " + bono);
	}


}

