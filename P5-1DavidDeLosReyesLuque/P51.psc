Algoritmo p51
	Definir dato, n, i, acum, prom Como Entero
	Escribir "Ingrese la cantidad de datos"
	Leer n
	
	i<-0
	Repetir
		i<-i+1
		Escribir "Ingrese el dato " ,i, ":"
		Leer dato
		acum<-acum+dato
	Hasta Que i=n
	
	prom<-acum/n
	Escribir "El promedio es: " ,prom
	
	
FinAlgoritmo
