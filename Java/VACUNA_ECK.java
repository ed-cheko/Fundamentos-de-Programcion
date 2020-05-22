/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "VACUNA_ECK.java."

import java.io.*;

public class VACUNA_ECK {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		String sexo;
		String vactipo;
		vactipo= "";
		// Definiendo Variables
		// Datos de Entrada
		System.out.println("Edad de la Persona: ");
		edad = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Sexo de la Persona: M si es Hombre o F si es Mujer: ");
		sexo = bufEntrada.readLine();
		// Precedimiento
		if (edad<16) {
			vactipo = "Se te aplicara la Vacuna A";
		} else {
			if ((edad>=16 && edad<=69)) {
				if (sexo.equals("M")) {
					vactipo = "Se te aplicara la Vacuna A";
				} else {
					vactipo = "Se te aplicara la Vacuna B";
				}
			} else {
				if (edad>=70 && edad<=150) {
					vactipo = "Se te aplicara la Vacuna C";
				}
			}
		}
		// Datos de SAlida
		System.out.println("Diagnostico del Paciente: ;D "+vactipo);
	}


}

