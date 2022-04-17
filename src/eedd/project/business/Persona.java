package eedd.project.business;

import java.util.Date;

/**
 * Clase que instancia una persona
 */

public class Persona {
	/**
	 * El nombre que recibira la persona
	 */
	protected String nombre;
	/**
	 * El apellido o los apellidos que tiene la persona
	 */
	protected String apellidos;
	/**
	 * El dni que tendra la persona
	 */
	protected String dni;
	/**
	 * La fecha en la que ha nacido la persona
	 */
	protected Date fechaNacimiento;
	/**
	 * El horario que tendra la persona
	 */
	private String horarioAsignado;
	/**
	 * La hora de entrada que tendra la persona
	 */
	private int horaEntrada;
	/**
	 * La hora de salida que tendra la persona
	 */
	private int horaSalida;
	
	/**
	 * El constructor de persona que instancia una nueva persona sin recibir ningun par�metro
	 */
	public Persona() {
		super();
	}
	
	/**
	 * M�todo que nos devuelve el nombre que tiene la persona.
	 * @return el valor del atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * M�todo que nos permite asignarle un nuevo nombre a la persona
	 * @param nombre el nombre que se le asignara a la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * M�todo que nos devuelve el apellido que tiene la persona.
	 * @return el valor del atributo nombre
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * M�todo que le asigna un nuevo apellido a la persona
	 * @param apellidos el nuevo apellido que se le asignara a la persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * M�todo que nos devuelve el dni que tiene la persona.
	 * @return el valor del atributo dni
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * M�todo que le asigna un nuevo dni a la persona
	 * @param dni el nuevo dni que se le asignara a la persona
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * M�todo que nos devuelve la fecha de nacimiento de la persona.
	 * @return el valor del atributo fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	/**
	 * M�todo que le asigna una nueva fecha de nacimiento a la persona
	 * @param fechaNacimiento la nueva fecha de nacimiento que se le asignara a la persona
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	 * M�todo que nos devuelve el horario que tiene la persona.
	 * @return el valor del atributo nombre
	 */
	public String getHorarioAsignado() {
		return horarioAsignado;
	}
	
	/**
	 * M�todo que le asigna un nuevo horario a la persona
	 * @param horarioAsignado el nuevo horario que se le asignara a la persona
	 */
	public void setHorarioAsignado(String horarioAsignado) {
		this.horarioAsignado = horarioAsignado;
	}
	
	/**
	 * M�todo que nos devuelve la hora de entrada que tiene la persona.
	 * @return el valor del atributo horaEntrada
	 */
	public int getHoraEntrada() {
		return horaEntrada;
	}
	
	/**
	 * M�todo que le asigna una nueva hora de entrada a la persona
	 * @param horaEntrada la nueva hora de entrada que se le asignara a la persona
	 */
	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	/**
	 * M�todo que nos devuelve la hora de salida que tiene la persona.
	 * @return el valor del atributo horaSalida
	 */
	public int getHoraSalida() {
		return horaSalida;
	}
	
	/**
	 * M�todo que le asigna una nueva hora de salida a la persona
	 * @param horaSalida la nueva hora de salida que se le asignara a la persona
	 */
	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

}