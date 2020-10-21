Algoritmo PrecioConsumoAgua
	precioBase <- 6
	precioOp2Completa <- 150*0.1
	Escribir 'Consumo en litros:'
	Leer litros
	Si litros<=50 Entonces
		precio <- precioBase
	SiNo
		Si litros<200 Entonces
			precio <- precioBase+(litros-50)*0.1
		SiNo
			precio <- precioBase+precioOp2Completa+(litros-200)*0.3
		FinSi
	FinSi
	Escribir precio
FinAlgoritmo
