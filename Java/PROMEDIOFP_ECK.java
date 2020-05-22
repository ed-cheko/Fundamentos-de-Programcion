/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "PROMEDIOFP_ECK.java."

import java.io.*;

public class PROMEDIOFP_ECK {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double promed;
		// Datos de entrada y definicion de variables
		System.out.println("Nota de unidad 1: ");
		nota1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Nota de unidad 2: ");
		nota2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Nota de unidad 3: ");
		nota3 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Nota de unidad 4: ");
		nota4 = Double.parseDouble(bufEntrada.readLine());
		// Proceso 
		nota1 = nota1*0.10;
		nota2 = nota2*0.15;
		nota3 = nota3*0.25;
		nota4 = nota4*0.50;
		promed = nota1+nota2+nota3+nota4;
		// Salida
		System.out.println("El Promedio de Fundamentos de Programacion es: "+promed);
	}


}

