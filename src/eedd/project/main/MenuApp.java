package eedd.project.main;

import java.util.Scanner;

import eedd.project.business.Administrativo;
import eedd.project.business.Profesor;
import eedd.project.business.Director;
import eedd.project.utils.Utils;

/**
 * La clase que nos permite probar el funcionamiento de las distintas clases
 */

public class MenuApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		mostrarPresentacion();
		
		String nombre = pedirNombre(sc);
		String primerApellido = pedirApellido(sc);
		
		bienvenida(nombre, primerApellido);
		
		salarioAdministrativo(sc);
		
		salariosProfesorYDirector(sc);
		
		calcularSalarioDirector(nombre, primerApellido);
		
		sc.close();
		
	}
	
	/**
	 * Método privado que nos pide el apellido
	 * @param sc nuestro apellido
	 * @return el valor introducido en el parámetro
	 */
	private static String pedirApellido(Scanner sc) {
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();
		return primerApellido;
	}
	
	/**
	 * Método privado que nos pide el nombre
	 * @param sc nuestro nombre
	 * @return el valor introducido en el parámetro
	 */
	private static String pedirNombre(Scanner sc) {
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		return nombre;
	}
	
	/**
	 * Método que nos imprime el salario de los profesores
	 * @param sc el número de profesores
	 */
	private static void salariosProfesorYDirector(Scanner sc) {
		System.out.println("Introduce el número de profesores : ");
		int numProf= sc.nextInt();
		Profesor[] listaProf = new Profesor[numProf];
		for (int i=0; i<numProf; i++) {
			listaProf[i] = new Profesor();
			listaProf[i].getSalario();
			System.out.println("El salario del profesor es: " + listaProf[i].getSalario());
		}
	}
	
	/**
	 * Método que nos devuelve el salario de los administrativos
	 * @param sc el número de administrativos
	 */
	private static void salarioAdministrativo(Scanner sc) {
		System.out.println("Introduce el número de administrativos : ");
		int numAdmins= sc.nextInt();
		Administrativo[] listaAdmins = new Administrativo[numAdmins];
		for (int i=0; i<numAdmins; i++) {
			listaAdmins[i] = new Administrativo();
			if (i<2) listaAdmins[i].setCategoria("A");
			else listaAdmins[i].setCategoria("B");
			//listaAdmins[i].getSalario();
			System.out.println("El salario del administrativo es: " + listaAdmins[i].getSalario());
		}
	}
	
	/**
	 * Método privado que nos imprime por pantalla un mensaje de bienvenida
	 * @param nombre nuestro nombre
	 * @param primerApellido nuestro apellido
	 */
	private static void bienvenida(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.fechaActual() );
		System.out.println("/*** " + Utils.horaActual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	
	/**
	 * Método que nos imprime por pantalla una presentación
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     Y DE NUEVO...                                                       ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOR OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}
	
	/**
	 * Método privado que nos calcula el salario de un director
	 * @param n el nombre que recibira el director
	 * @param a el apellido que recibira el director
	 */
	private static void calcularSalarioDirector(String n, String a)
	{
		Director d = new Director();
		d.setNombre(n);
		d.setApellidos(a);
		
		System.out.println("El salario del director es: " + d.getSalario());
	}

}
