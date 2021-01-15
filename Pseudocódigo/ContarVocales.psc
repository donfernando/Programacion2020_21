Algoritmo sin_titulo
	Escribir "Escribe una frase: "
	Leer frase
	Para pos<-0 Hasta frase.length()-1 Hacer
		ch <- el caracter de la posicion pos de la frase
		poner ch en minusculas
		Si ch es la 'a' Entonces
			cont_a <- cont_a+1
		SiNo
			Si ch es la 'e' Entonces
				cont_e <- cont_e+1
			SiNo
				Si ch es la 'i' Entonces
					cont_i <- cont_i+1
				SiNo
					Si ch es la 'o' Entonces
						cont_o <- cont_o+1
					SiNo
						Si ch es la 'u' Entonces
							cont_u <- cont_u+1
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
FinAlgoritmo
