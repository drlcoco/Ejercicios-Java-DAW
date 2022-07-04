Algoritmo P52
	Definir num1,num2,suma,resta,division,producto Como Entero
	Escribir 'Introduzca el número 1'
	Leer num1
	Escribir 'Introduzca el número 2'
	Leer num2
	Si num1=num2 Entonces
		Escribir 'El número 1 es igual al número 2 y vamos a hacer su suma y su producto.'
		suma <- num1+num2
		Escribir 'El resultado de la suma es: ',suma
		producto <- num1*num2
		Escribir 'El resultado del producto es: ',producto
	FinSi
	Si num1<>num2 Entonces
		Escribir 'El número 1 es diferente al número 2.'
		Si num1-num2>0 Entonces
			Escribir 'El número 1 es mayor que el número 2 y vamos a hacer su resta y su división.'
			resta <- num1-num2
			Escribir 'El resultado de la resta es: ',resta
			division <- num1/num2
			Escribir 'El resultado de la división es: ',division
		FinSi
		Si num2-num1>0 Entonces
			Escribir "El número 2 es mayor que el número 1 y vamos a hacer su resta y su división";
			resta <- num2-num1
			Escribir 'El resultado de la resta es: ',resta
			division <- num2/num1
			Escribir 'El resultado de la división es: ',division
		FinSi
	FinSi
FinAlgoritmo
