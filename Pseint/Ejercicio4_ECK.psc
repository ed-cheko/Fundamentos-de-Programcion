Algoritmo opearitmetic_ECK
	//Definir VAriables
	Definir num1, num2, total Como Real
	Definir operac Como Caracter
	//Datos de Entrada
	Escribir "Escrive el primer numero: "
	Leer num1
	Escribir "Escribe el segundo numero: "
	Leer  num2
	Escribir "Que operacion realizaras: Suma(+) Resta(-), Division(/), Multiplicacion(*), Potencia(^) "
	Leer operac
	//Proceso 
	Segun operac Hacer
		Caso '+': total<-num1+num2
				Escribir "La suma es: " total
		caso '-': total<-num1-num2
				Escribir "La resta es: " total		
		caso '/': total<-num1/num2
			Escribir "La division es: " total	
		caso '*': total<-num1*num2
			Escribir "La multiplicacion es: " total	
		caso '^': total<-num1^num2
			Escribir "La resta es: " total	
		De Otro Modo:
			Escribir "Escribe una operacion"
	Fin Segun
FinAlgoritmo
