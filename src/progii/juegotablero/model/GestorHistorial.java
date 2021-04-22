package progii.juegotablero.model;


import progii.juegotablero.exceptions.MovimientoException;
import stacks.exceptions.EmptyStackException;
import stacks.Stack;
import anotacion.Programacion2;

@Programacion2 (
nombreAutor1 = "ZhengYu",
apellidoAutor1 = "Ye",
emailUPMAutor1 = "z.ye@alumnos.upm.es"
	)


/**
 * Clase que gestiona el historial de movimientos de la partida
 * 
 *
 */
public class GestorHistorial {
	
	
	/**
	 * Pila con los movimientos a deshacer
	 */
	private Stack<Movimiento> pilaDeshacer;

	/**
	 * Pila con los movimientos a rehacer
	 */
	private Stack<Movimiento> pilaRehacer;
	
	/**
	 * Crea e inicializa las pilas del gestor del historial
	 */
	public GestorHistorial() {
		pilaDeshacer=new Stack<Movimiento>();
		pilaRehacer=new Stack<Movimiento>();
	}
	
	/**
	 * Guarda un nuevo movimientos en el historial
	 * @param movimiento Movimiento a guardar
	 */
	public void guardarMovimiento (Movimiento movimiento) {
		if(pilaRehacer.isEmpty())
			pilaDeshacer.push(movimiento);
		else
			pilaDeshacer.push(movimiento);
			pilaRehacer.makeEmpty();
	}
	
	/**
	 * Devuelve el último movimiento realizado y lo elimina de la pila de deshacer
	 * @return El movimiento a deshacer
	 * @throws MovimientoException En caso de que no haya movimientos que deshacer
	 */
	
	public Movimiento deshacer () throws MovimientoException {
		try {
			
			pilaRehacer.push(pilaDeshacer.peek());
			return pilaDeshacer.pop();
		}
		catch(EmptyStackException e) {
			throw new MovimientoException("No se puede deshacer porque no hay movimientos para deshacer");
		}
	}
	
	/**
	 * Devuelve el último movimiento deshecho y lo elimina de la pila de rehacer
	 * @return El movimiento a rehacer
	 * @throws MovimientoException En caso de que no haya movimientos que rehacer
	 */
	public Movimiento rehacer () throws MovimientoException {
		try {
			pilaDeshacer.push(pilaRehacer.peek());
			return pilaRehacer.pop();
		}
		catch(EmptyStackException e) {
			throw new MovimientoException("No se puede rehacer porque no hay movimientos para rehacer");
		}
			
	}
	
}
