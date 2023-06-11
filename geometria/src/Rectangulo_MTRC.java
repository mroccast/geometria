/**
 * Clase Rectangulo_MTRC
 * 
 * @author Maria Teresa Rocamora Castello
 * @version 1.2
 */
public class Rectangulo_MTRC extends FiguraGeometrica_MTRC {

	private double l1;
	private double l2;

	/**
	 * Constructor de la clase Rectangulo_MTRC que construye un objeto Rectangulo_MTRC con
	 * los paremetros dados
	 *
	 * @param tipoFigura El tipo de figura que se esta creando (rectangulo)
	 * @param lG El lado grande del rectangulo
	 * @param lP El lado pequeño del rectangulo
	 */
	public Rectangulo_MTRC(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}


	/**
	 * El método area calcula el área del rectangulo multiplicando sus lados
	 *
	 * @return El area del rectangulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}


	/**
	 * El método perímetro calcula el perímetro del rectangulo sumando
	 * la multiplicación de cada lado por dos.
	 *
	 * @return El perimetro del rectangulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
