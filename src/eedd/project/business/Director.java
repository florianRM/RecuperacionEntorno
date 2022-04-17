package eedd.project.business;

import java.util.Date;

/**
 * Una clase que instancia un director heredando de la clase persona.
 */

public class Director extends Persona {
	
	/**
	 * Es el salario que tiene el director.
	 */
	private static final int SALARIO = 2300;
	
	/**
	 * Instancia un director sin parámetros.
	 */
	public Director() {
		super();
	}
	
	/**
	 * Instancia un director recibiendo parámetros como el nombre, apellidos, dni y fecha de nacimiento
	 * @param nombre El nombre que recibira el director.
	 * @param apellidos El apellido que recibira el director.
	 * @param dni El dni del director.
	 * @param fechaNacimiento La fecha de nacimiento del director.
	 */
	public Director(String nombre, String apellidos, String dni, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	 * Método que nos devuelve el salario que tiene el director
	 * @return el valor del atributo salario.
	 */
	public float getSalario() {
		return SALARIO;
	}

}
