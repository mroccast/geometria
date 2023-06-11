import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTests {

	@Test
	public void test_radio_7() {
		Circulo_MTRC circulo = new Circulo_MTRC(7, "Circulo");
		assertEquals(circulo.area(), 153.9384, 0);
		assertEquals(circulo.perimetro(), 43.9824, 0);
		
	}
	@Test
	public void test_radio_0() {
		Circulo_MTRC circulo = new Circulo_MTRC(0, "Circulo");
		assertEquals(circulo.area(), 0, 0);
		assertEquals(circulo.perimetro(), 0, 0);
	}
	@Test
	public void test_radio_minus_3() {
		Circulo_MTRC circulo = new Circulo_MTRC(-3, "Circulo");
		assertEquals(circulo.area(), 28.2744, 0);
		assertEquals(circulo.perimetro(), 18.8496, 0);
	}
}
