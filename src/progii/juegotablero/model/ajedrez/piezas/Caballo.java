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
 * Clase que representa a la Caballo
 * @author groman
 *
 */

public class Caballo extends PiezaAjedrez  {

	/**
	 * Crea una caballo pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Caballo(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.CABALLO, fila, columna);

		
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* El caballo se puede mover con el formato caracter��stica de la letra L
		 * Si hay una ficha de color contrario también puede moverse a esa posición comíendose la pieza 
		*/
		//Vertical descendente izquierda según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()+2, getColumna()-1);
		//Vertical descendente derecha según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()+2,  getColumna()+1);
		//Vertical ascendente izquierda según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()-2,  getColumna()-1);
		//Vertical ascendente derecha según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()-2,  getColumna()+1);
		//Horiznotal izquierda superior según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()-1,  getColumna()-2);
		//Horiznotal izquierda inferior según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()+1,  getColumna()-2);
		//Horizontal derecha superior según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()-1,  getColumna()+2);
		//Horizontal derecha inferior según el modelo interno (matriz)
		casillaVisitable (resultado, getFila()+1,  getColumna()+2);
		return resultado;
	}

}

