Algoritmo incremento10_ECK
	//Definir variables
	Definir salario Como Real
	Definir contara�os, a�os Como Entero
	contara�os<-1
	//DAtos de Entrada
	Escribir "Escribe el salario inicial: "
	Leer salario
	Escribir "A�os de incremento"
	Leer a�os
	//Proceso 
	Mientras contara�os<= a�os Hacer
		salario=salario+(salario*0.10)
		Escribir "El salario en el a�o ", contara�os," es de ", salario
		contara�os<- contara�os+1
	FinMientras
	
FinAlgoritmo
