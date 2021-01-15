Algoritmo sin_titulo
	//Inicializar todos los contadores a 0
	Escribir "Escribe una frase"
	Leer frase
	Para pos<-0 Hasta tamaño(frase)-1 Hacer
		// dentro
		ch <- frase.charAt(pos)
		ch <- pasar_a_Minusculas(ch)
		Si esLetra(ch) Entonces
			contLetras <- contLetras + 1
			Si ch = 'a' Entonces
				//contA++
			SiNo
				Si ch_es_la_e_mayusc_o_minúscula Entonces
					//contE++
				SiNo
					Si ch='i' Entonces
						//contI++
					SiNo
						Si ch='o' Entonces
							//contO++
						SiNo
							Si ch='u' Entonces
								//contU++
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "Letras: ",contLetras
	Escribir "Aes: ",contA
	Escribir "Ees: ",contE
FinAlgoritmo
