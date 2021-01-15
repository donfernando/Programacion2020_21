Algoritmo ControlFiesta
	Escribir 'Tu edad: '
	Leer edad
	Escribir 'Tiene Carnet del Club: '
	Leer tieneCarnet
	Si tieneCarnet y edad<18 y edad >15 Entonces
		Escribir 'Viene acompañado de un adulto: '
		Leer acompañado
	FinSi
	Si tieneCarnet Entonces
		Si edad>=18
			Escribir 'Puede pasar'
		SiNo
			si edad>15 Y acompañado
				Escribir 'Puede pasar'
			SiNo
				Escribir 'Se queda fuera. No tiene permiso para entrar'
			FinSi
		FinSi
	SiNo
		Escribir 'Se queda fuera. No tiene permiso para entrar'
	FinSi
FinAlgoritmo
