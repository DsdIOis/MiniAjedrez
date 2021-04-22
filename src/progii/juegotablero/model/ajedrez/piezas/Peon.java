package progii.juegotablero.model.ajedrez.piezas;


import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.ControlJugadoresAjedrez;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;
import anotacion.Programacion2;

@Programacion2 (
nombreAutor1 = "ZhengYu",
apellidoAutor1 = "Ye",
emailUPMAutor1 = "z.ye@alumnos.upm.es"
	)
/**
 * Clase que representa a la Peon
 * @author groman
 *
 */

public class Peon extends PiezaAjedrez  {

	/**
	 * Crea una peon pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Peon(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.PEON, fila, columna);

		
	}



	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* El peon se puede mover en diagonal y vertical
		*/
		
		int filaDes=getFila()+1;
		int filaAs=getFila()-1;
		int columnaDer=getColumna()-1;
		int columnaIzq=getColumna()+1;
		
		if(this.getJugador().getId()==ControlJugadoresAjedrez.NEGRO) {

			if(queHay(filaDes, columnaDer)!=null)
				casillaVisitable (resultado, filaDes, columnaDer);
			if(queHay(filaDes, columnaIzq)!=null)
				casillaVisitable (resultado, filaDes,columnaIzq);
			if(queHay(filaDes,getColumna())==null)	
				casillaVisitable (resultado, filaDes, getColumna());
			if(this.getFilaAjedrez()==7&&queHay(filaDes,getColumna())==null) 
					casillaVisitable (resultado, filaDes+1, getColumna());
	
		
		}
			
		if(this.getJugador().getId()==ControlJugadoresAjedrez.BLANCO) {
		
			if(queHay( filaAs, columnaDer)!=null)
				casillaVisitable (resultado,  filaAs, columnaDer);
			if(queHay( filaAs, columnaIzq)!=null)
				casillaVisitable (resultado,  filaAs, columnaIzq);
			if(queHay(filaAs,getColumna())==null)
				casillaVisitable (resultado, filaAs, getColumna());
			if(this.getFilaAjedrez()==2&&queHay( filaAs,getColumna())==null)
				casillaVisitable (resultado,  filaAs-1, getColumna());	
			
		}	
				
	
		return resultado;
	}

}

