package br.com.class018.day18;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {

	private Calculadora calc;
	
	@Before
	public void antesDeCadaTeste() {
		calc = new Calculadora();
	}
	
	@After
	public void depoisDeCadaTest() {
		System.out.println("Terminou mais um teste");
	}
	
	@Test
	public void testSomarDoisMaisDois() {
		double resultado = calc.somar(2.0, 2.0);
		Assert.assertEquals(4.0, resultado, 0.0);
	}
	
	@Test
	public void testSomarDoisMaisTres() {
		double resultado = calc.somar(2.0, 3.0);
		Assert.assertEquals(5.0, resultado, 0.0);
	}
	
	@Test
	public void testSomarCincosMais20() {
		double resultado = calc.somar(5.0, 20.0);
		Assert.assertEquals(25.0, resultado, 0.0);
	}
	
	@Test
	public void testSubtraiDoisMenosDois() {
		double resultado = calc.subtrair(2.0, 2.0);
		Assert.assertEquals(0.0, resultado, 0.0);
	}
	
	@Test
	public void testSubtraiDoisMenosTres() {
		double resultado = calc.subtrair(2.0, 3.0);
		Assert.assertEquals(-1.0, resultado, 0.0);
	}
	
	@Test
	public void testSubtraiVinteMenosCinco() {
		double resultado = calc.subtrair(20.0, 5.0);
		Assert.assertEquals(15.0, resultado, 0.0);
	}
	
	@Test
	public void testSubtraiTresMenosUmPontoCinco() {
		double resultado = calc.subtrair(3.0, 1.5);
		Assert.assertEquals(1.5, resultado, 0.0);
	}
}
