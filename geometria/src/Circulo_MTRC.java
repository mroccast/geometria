
public class Circulo_MTRC extends FiguraGeometrica_MTRC {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_MTRC(double r, String tipoFigura) {
		super(tipoFigura);
		if(r < 0)
			radio = -1 * r;
		else
			radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
