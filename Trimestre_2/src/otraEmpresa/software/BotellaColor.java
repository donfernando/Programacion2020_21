package otraEmpresa.software;

import java.awt.Color;

import minik.herencia.Botella;

public class BotellaColor extends Botella {
	private Color color;

	public BotellaColor(int capacidad, Color c) {
		super(capacidad);
		if (c == null)
			throw new RuntimeException();
		color = c;
	}

	
	@Override
	public String toString() {
		return String.format("Botella (color %s) %.1f %s[%.2f %s, %s]", color, capacidad, unidades, contenido, unidades,
				(cerrada ? "cerrada" : "abierta"));
	}
	
	@Override
	public boolean equals(Object obj) {
		 if( ! super.equals(obj) )
			 return false;
		 
	     if (obj instanceof BotellaColor) {
	 		BotellaColor laOtra = (BotellaColor)obj;
        	return color.equals(laOtra.color);
	     }
	     return false;	
	}	
}