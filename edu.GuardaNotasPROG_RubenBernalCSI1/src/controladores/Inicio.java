/***
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase controladora de la aplicación
 * @author rbr
 * 01/12/25
 */
public class Inicio {
	
	public static Scanner sc = new Scanner(System.in);
	
	/**
	 * Método de entrada de la aplicación
	 * @author rbr
	 * @param args
	 * 01/12/25
	 */
	public static void main(String[] args) {
		
		//Variables
		double nota = 0;
		byte opcion;
		boolean cerrarMenu = false;
		
		//Interfaces con sus implementaciones
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		
		do {
			//Muestro el menu por pantalla
			mi.mostrarMenu();
			//Recojo la opcion deseada por el usuario
			opcion = sc.nextByte();
			//Accedo a la opcion seleccionada por el usuario
			switch(opcion) {
				case 1:
					System.out.println("Cerrando aplicación...");
					cerrarMenu = true;
					System.out.println("Aplicación cerrada correctamente!!");
					break;
				case 2:
					nota = oi.anyadirNota(nota);
					break;
				case 3:
					oi.dibujarGrafica(nota);
					break;
				default:
					System.err.println("La opción introducida no es válida...");
					System.err.println("Pruebe de nuevo...");
					break;
			}
		}while(!cerrarMenu);

		//Cierro la variable Scanner
		sc.close();
	}

}
