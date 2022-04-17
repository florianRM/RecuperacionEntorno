package eedd.project.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase que nos ayuda con funciones de fecha y horas
 */

public class Utils {
	
	/**
	 * Método que nos devuelve la hora, minutos y segundos del momento
	 * @return la hora, minutos y segundos actuales
	 */
	public static String horaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método que solo nos devuelve la hora del momento
	 * @return la hora actual
	 */
	public static int horaCortaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH");
		
		return Integer.parseInt(dtf.format(LocalDateTime.now()));
	}
	
	/**
	 * Método que nos devuelve la fecha del momento
	 * @return fecha actual
	 */
	public static String fechaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método que nos calcula las horas que nos quedan para salir
	 * @param horaSalida la hora de salida
	 * @return el numero de horas restantes para salir
	 */
	public static int calcularHorasPendientes (int horaSalida) {
		int result = 0;
		result = horaSalida - horaCortaActual();
		return result;
	}

}
