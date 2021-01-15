Algoritmo sin_titulo
	// Inicializar todos los contadores a 0
	Escribir 'Escribe una frase'
	Leer frase
	Para pos<-0 Hasta Longitud(frase)-1 Hacer
		// dentro
		//ch <- frase(pos)
		ch <- Minusculas(ch)
		Si true Entonces
			contLetras <- contLetras+1
			Segun ch Hacer
				'a':
					// contA++
				'e':
					// contE++
				'i':
					// contI++
				'o':
					
					// contO++
				'u':
					// contU++
			FinSegun
		FinSi
	FinPara
	Escribir 'Letras: ',contLetras
	Escribir 'Aes: ',contA
	Escribir 'Ees: ',contE
FinAlgoritmo
