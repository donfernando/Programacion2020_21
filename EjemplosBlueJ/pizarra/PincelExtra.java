ia


import java.awt.Color;
import pizarra.figuras.*;

public class PincelExtra extends Pincel { 
  public static final int CIRCULO_COLOR=6;
  public static final int AROS_OLIMPICOS=7;


  public PincelExtra(int forma,int px,int py) {
    this(forma, px, py, false);
  }

  public PincelExtra(int forma,int px,int py, boolean activo) {
    super(forma,px,py,activo);
    switch(forma) {
    case CIRCULO_COLOR: punta=new AroColor(px,py,30,Color.red);
        break;
    case AROS_OLIMPICOS: punta=new LogoOlimpico(px,py,40);
    }
  }


}