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
 * Clase que representa a la Alfill
 * @author ZhengYu Ye
 *
 */

public class Alfil extends PiezaAjedrez  {

	/**
	 * Crea una alfil pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Alfil(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.ALFIL, fila, columna);

		
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* La alfil se puede mover en diagonal
		 * Si hay una ficha de color contrario también puede moverse a esa posición comíendose la pieza 
		*/
		//Ascendente izquierda según el modelo interno (matriz)
		casillasVisitables (resultado, -1, -1);
		//Ascendente derecha según el modelo interno (matriz)
		casillasVisitables (resultado, -1, 1);
		
		//Descendente izquierda según el modelo interno (matriz)
		casillasVisitables (resultado, 1, -1);
		//Descendente derecha según el modelo interno (matriz)
		casillasVisitables (resultado, 1, 1);
		return resultado;
	}

}

