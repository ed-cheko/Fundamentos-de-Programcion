/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "OPEARITMETIC_ECK.java."

import java.io.*;
import java.math.*;

public class OPEARITMETIC_ECK {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double num1;
		double num2;
		String operac;
		double total;
		// Definir VAriables
		// Datos de Entrada
		System.out.println("Escrive el primer numero: ");
		num1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Escribe el segundo numero: ");
		num2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Que operacion realizaras: Suma(+) Resta(-), Division(/), Multiplicacion(*), Potencia(^) ");
		operac = bufEntrada.readLine();
		// Proceso 
		switch (operac) {
		case "+":
			total = num1+num2;
			System.out.println("La suma es: "+total);
			break;
		case "-":
			total = num1-num2;
			System.out.println("La resta es: "+total);
			break;
		case "/":
			total = num1/num2;
			System.out.println("La division es: "+total);
			break;
		case "*":
			total = num1*num2;
			System.out.println("La multiplicacion es: "+total);
			break;
		case "^":
			total = Math.pow(num1,num2);
			System.out.println("La potencia es: "+total);
			break;
		default:
			System.out.println("Escribe una operacion");
		}
	}


}

