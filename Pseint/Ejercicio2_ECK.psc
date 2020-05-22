Algoritmo bonodesempeño_ECK
	//Definicion de variables
	Definir bono, salario, puntos Como Entero
	//DAtos de Entrada
	Escribir "Escribir Salario minimo: "
	Leer salario
	Escribir "Cantidad de puntos: "
	Leer puntos
	//Preceso
	si puntos>=50 y puntos<=100
		Entonces
		bono<- (salario*0.10)
	SiNo
		si puntos>= 101 y puntos<= 150	
			Entonces
			bono<- (salario*0.50)
		SiNo
			si puntos >=151
				bono<- (salario*1.0)
			FinSi
		FinSi
	FinSi
	//Datos de  Salida
	Escribir "El monto del bono es: " bono
FinAlgoritmo
