Algoritmo incremento10_ECK
	//Definir variables
	Definir salario Como Real
	Definir contaraños, años Como Entero
	contaraños<-1
	//DAtos de Entrada
	Escribir "Escribe el salario inicial: "
	Leer salario
	Escribir "Años de incremento"
	Leer años
	//Proceso 
	Mientras contaraños<= años Hacer
		salario=salario+(salario*0.10)
		Escribir "El salario en el año ", contaraños," es de ", salario
		contaraños<- contaraños+1
	FinMientras
	
FinAlgoritmo
