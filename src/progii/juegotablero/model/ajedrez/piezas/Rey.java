package progii.juegotablero.model.ajedrez.piezas;


import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;
import anotacion.Programacion2;

@Programacion2 (
nombreAutor1 = "ZhengYu",
apellidoAutor1 = "Ye",
emailUPMAutor1 = "z.ye@alumnos.upm.es"
	)
/**
 * Clase que representa al Rey
 * @author ZhengYu Ye
 *
 */

public class Rey extends PiezaAjedrez  {

	/**
	 * Crea un Rey pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Rey(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.REY, fila, columna);

		
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* El rey se puede mover en horizontal , vertical y diagonal
		 * Si hay una ficha de color contrario tambien puede moverse a esa posicion comíendose la pieza 
		*/
		//Vertical descendente según el modelo interno (matriz)
		casillaVisitable (resultado,getFila()+ 1, getColumna()+0);
		//Vertical ascendente según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()-1, getColumna()+0);
		//Horiznotal izquierda según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()+0, getColumna()-1);
		//Horizontal derecha según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()+0, getColumna()+1);
		//Ascendente izquierda según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()-1, getColumna()-1);
		//Ascendente derecha según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()-1, getColumna()+1);
		//Descendente izquierda según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()+1, getColumna()-1);
		//Descendente derecha según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()+1, getColumna()+1);
		
		
		return resultado;
	}

}


