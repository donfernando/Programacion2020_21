Algoritmo sin_titulo
	Escribir 'Dame los datos...'
	Leer Categoria
	Leer Antiguedad
	Leer NHijos
	Segun Categoria Hacer
		'A':
			Salario <- 1800
		'B':
			Salario <- 1500
		'C':
			Salario <- 980
		De Otro Modo:
			//ERROR
	FinSegun
	Si Antiguedad>=5 Entonces
		// La división debe ser sin decimales
		Trienios <- Antiguedad / 3
	SiNo
		Trienios <- 0
	FinSi
	Salario <- Salario + Trienios * 80
	Si NHijos != 0 Entonces
		retencion <- 16 * Salario / 100
	SiNo
		retencion <- 19 * Salario / 100
	FinSi
	Salario <- Salario - retencion
	Escribir "Salario: ", Salario
FinAlgoritmo
