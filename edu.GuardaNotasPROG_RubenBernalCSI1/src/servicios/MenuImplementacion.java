/***
 * Rubén Bernal Ramos, CSI1
 */

package servicios;

/**
 * Implementación de la interfaz del menú de la aplicación
 * @author rbr
 * 01/12/25
 */
public class MenuImplementacion implements MenuInterfaz{

	/**
	 * Método que mostrará el menú de la aplicación
	 * @author rbr
	 * 01/12/25
	 */
	public void mostrarMenu() {
		
		System.out.println("-----------------------------------------");
		System.out.println("                   MENU                  ");
		System.out.println("-----------------------------------------");
		System.out.println("1. Cerrar aplicación                     ");
		System.out.println("2. Añadir nota                           ");
		System.out.println("3. Dibujar gráfica de la nota            ");
		System.out.println("-----------------------------------------");
		System.out.println("Seleccione una opción: ");
		
	}

}
