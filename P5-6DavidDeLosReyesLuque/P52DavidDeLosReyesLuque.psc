Algoritmo P52
	Definir num1,num2,suma,resta,division,producto Como Entero
	Escribir 'Introduzca el n�mero 1'
	Leer num1
	Escribir 'Introduzca el n�mero 2'
	Leer num2
	Si num1=num2 Entonces
		Escribir 'El n�mero 1 es igual al n�mero 2 y vamos a hacer su suma y su producto.'
		suma <- num1+num2
		Escribir 'El resultado de la suma es: ',suma
		producto <- num1*num2
		Escribir 'El resultado del producto es: ',producto
	FinSi
	Si num1<>num2 Entonces
		Escribir 'El n�mero 1 es diferente al n�mero 2.'
		Si num1-num2>0 Entonces
			Escribir 'El n�mero 1 es mayor que el n�mero 2 y vamos a hacer su resta y su divisi�n.'
			resta <- num1-num2
			Escribir 'El resultado de la resta es: ',resta
			division <- num1/num2
			Escribir 'El resultado de la divisi�n es: ',division
		FinSi
		Si num2-num1>0 Entonces
			Escribir "El n�mero 2 es mayor que el n�mero 1 y vamos a hacer su resta y su divisi�n";
			resta <- num2-num1
			Escribir 'El resultado de la resta es: ',resta
			division <- num2/num1
			Escribir 'El resultado de la divisi�n es: ',division
		FinSi
	FinSi
FinAlgoritmo
