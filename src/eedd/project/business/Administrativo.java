package eedd.project.business;

import java.util.Date;

/**
 * Una clase que instancia un administrativo heredando de la clase persona.
 */

public class Administrativo extends Persona {
	
	/**
	 * La categoria que tiene el administrativo.
	 */
	private String categoria;
	
	/**
	 * Instancia un nuevo administrativo sin recibir par�metros.
	 */
	public Administrativo () {
		super();
	}
	
	/**
	 * Instancia un nuevo profesor pero esta vez recibiendo los par�metros de nombre, apellidos, dni
	 * fecha de nacimiento y la categor�a.
	 * @param nombre El nombre que recibira el administrativo.
	 * @param apellidos El apellido que recibira el administrativo.
	 * @param dni El dni que recibira el administrativo.
	 * @param fechaNacimiento La fecha que recibira el administrativo.
	 * @param categoria La categoria que tendr� el administrativo.
	 */
	public Administrativo(String nombre, String apellidos, String dni, Date fechaNacimiento, String categoria) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.categoria = categoria;
	}
	
	/**
	 * M�todo que nos devuelve la categor�a que tiene el administrativo.
	 * @return el valor que tiene el atributo de la categoria del administrativo.
	 */
	public String getCategoria() {
		return categoria;
	}
	
	/**
	 * M�todo que nos permite modificar el atributo de categor�a al administrativo.
	 * @param categoria la nueva categor�a que se le asignara al administrativo.
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	/**
	 * M�todo que nos devuelve el salario que tiene el administrativo
	 * @return 1500 si la categor�a es A o 1200 si es distinta.
	 */
	public float getSalario() {
		float result = 0;
		if (this.categoria.equals("A"))
			result = 1500;
		else 
			result = 1200;
			
		return result;
	}
	
}
