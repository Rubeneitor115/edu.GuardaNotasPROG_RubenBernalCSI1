/***
 * Rubén Bernal Ramos, CSI1
 */

package servicios;

import controladores.Inicio;

/**
 * Implementación de la interfaz operativa de la aplicación
 * @author rbr
 * 01/12/25
 */
public class OperativaImplementacion implements OperativaInterfaz{

	/**
	 * Método para dibujar la gráfica de la nota introducida por el usuario
	 * @param double nota
	 * @author rbr
	 * 01/12/25
	 */
	public void dibujarGrafica(double nota) {
		System.out.println("_");
		
		for(int i=10; i>=1; i--) {
			if(nota>i) {
				System.out.println(i + " *");
			}else if(nota == i){
				System.out.println(i + " *");
			}else {
				System.out.println(i);
			}
		}
		
		System.out.println("_");
		
	}

	/**
	 * Método para añadir la nota obtenida por el usuario
	 * @param double nota
	 * @return double nota
	 * 01/12/25
	 */
	public double anyadirNota(double nota) {
		
		System.out.println("Introduce la nota: ");
		nota = Inicio.sc.nextDouble();
		
		return nota;
	}

}
