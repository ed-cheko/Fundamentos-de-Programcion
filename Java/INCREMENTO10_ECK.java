/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "INCREMENTO10_ECK.java."

import java.io.*;

public class INCREMENTO10_ECK {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int anos;		
		int contaranos;
		double salario;
		// Definir variables
		contaranos = 1;
		// DAtos de Entrada
		System.out.println("Escribe el salario inicial: ");
		salario = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Años de incremento");
		anos = Integer.parseInt(bufEntrada.readLine());
		// Proceso 
		while (contaranos<=anos) {
			salario = salario+(salario*0.10);
			System.out.println("El salario en el año "+contaranos+" es de "+salario);
			contaranos = contaranos+1;
		}
	}


}

