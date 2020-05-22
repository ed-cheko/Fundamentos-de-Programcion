Algoritmo vacuna_ECK
	//Definiendo Variables
	Definir edad Como Entero
	Definir sexo Como Caracter
	Definir vactipo Como Caracter
	//Datos de Entrada
	Escribir "Edad de la Persona: "
	Leer edad
	Escribir "Sexo de la Persona: M si es Hombre o F si es Mujer: "
	Leer sexo
	//Precedimiento
	si edad < 16
		Entonces
		vactipo = "Se te aplicara la Vacuna A"
	SiNo
		si (edad >= 16 y edad<=69) 
			Entonces
			si sexo = "M" 
				Entonces
				vactipo = "Se te aplicara la Vacuna A"
			SiNo
				vactipo = "Se te aplicara la Vacuna B"
			FinSi
		SiNo
			si edad>= 70 y edad<=150
				Entonces
				vactipo = "Se te aplicara la Vacuna C"
			FinSi
			
			
		FinSi
	FinSi
	//Datos de SAlida
	Escribir "Diagnostico del Paciente: ;D " vactipo
FinAlgoritmo
