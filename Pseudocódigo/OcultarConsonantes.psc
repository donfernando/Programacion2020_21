Algoritmo Ocultar_consonantes
	Escribir 'Escribe una frase'
	Leer frase
	// paso toda la frase a minusculas
	frase <- sdjsdc asdv asv Minusculas(frase)
	Para posicion<-1 Hasta Longitud(frase) Hacer
		letra <- SubCadena(frase,posicion,posicion)
		Si NoEsLetra[letra] Y letra<>'a' Y letra<>'e' Y letra<>'i' Y letra<>'o' Y letra<>'u' Entonces
			Escribir '*'
		SiNo
			Escribir letra
		FinSi
	FinPara
FinAlgoritmo
