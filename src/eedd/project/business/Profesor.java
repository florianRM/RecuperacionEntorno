package eedd.project.business;

import java.util.Date;

/**
 * Una clase que instancia un profesor heredando de la clase persona.
 */

public class Profesor extends Persona {
	
	/**
	 * La especialidad que tendra el profesor
	 */
	private String especialidad;
	/**
	 * Instancia un nuevo profesor sin recibir parámetros.
	 */
	public Profesor() {
		super();
	}

	/**
	 * Instancia un nuevo profesor pero esta vez recibiendo los parámetros de nombre, apellidos, dni
	 * fecha de nacimiento y la especialidad.
	 * @param nombre El nombre que recibira el profesor.
	 * @param apellidos El apellido que recibira el profesor.
	 * @param dni El dni que recibira el profesor.
	 * @param fechaNacimiento La fecha que recibira el profesor.
	 * @param especialidad La especiaidad que tendrá el profesor.
	 */
	public Profesor(String nombre, String apellidos, String dni, Date fechaNacimiento, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.especialidad = especialidad;
	}
	
	/**
	 * Método que nos devuelve la especialidad que tiene el profesor.
	 * @return el valor que tiene el atributo de la especialidad del profesor.
	 */
	public String getEspecialidad() {
		return especialidad;
	}
	
	/**
	 * Método que nos permite modificarle la especialidad al profesor.
	 * @param especialidad la nueva especialidad que se le asignara al profesor.
	 */
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	/**
	 * Método que nos devuelve el salario que tiene el profesor
	 * @return el valor de la variable result.
	 */
	public float getSalario() {
		float result;
		
		result = 1900;
		return result;
	}

}
