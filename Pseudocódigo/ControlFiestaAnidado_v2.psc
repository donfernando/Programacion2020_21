Algoritmo ControlFiesta
	Escribir 'Tiene Carnet del Club: '
	Leer tieneCarnet
	Si tieneCarnet Entonces
		Escribir 'Tu edad: '
		Leer edad
		Si edad>=18 Entonces
			Escribir 'Puede pasar'
		SiNo
			Si edad>15 Entonces
				Escribir 'Viene acompaņado de un adulto: '
				Leer acompaņado
				Si acompaņado Entonces
					Escribir 'Puede pasar'
				SiNo
					Escribir 'Se queda fuera. No tiene permiso para entrar'
				FinSi
			SiNo
				Escribir "No pasas"
			FinSi
		FinSi
	SiNo
		Escribir 'Se queda fuera. No tiene permiso para entrar'
	FinSi
FinAlgoritmo
