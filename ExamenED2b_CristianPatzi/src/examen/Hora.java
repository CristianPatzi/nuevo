package examen;

/**
 * @author Cristian
 * @version 1.0
 */

public class Hora {
	boolean horaValida;
/**
 * Metodo publico para validar una hora
 * return boolean
 */
	public boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}
 