package br.com.class018.day18;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraDescontoTest {
	private CalculadoraDesconto calcDesconto;
	
	@Before
	public void before() {
		calcDesconto = new CalculadoraDesconto();
	}
	
	
	@Test
	public void testMenos1() {
		double resultado = calcDesconto.aplicarDesconto(-1);
		Assert.assertEquals(0.0, resultado, 0.0);
	}
	
	@Test
	public void test0() {
		double resultado = calcDesconto.aplicarDesconto(0.0);
		Assert.assertEquals(0.0, resultado, 0.0);
	}
	@Test
	public void test1000() {
		double resultado = calcDesconto.aplicarDesconto(1000);
		Assert.assertEquals(1000.0, resultado, 0.0);
	}
	
	@Test
	public void test1799() {
		double resultado = calcDesconto.aplicarDesconto(1799.0);
		Assert.assertEquals(1799.0, resultado, 0.0);
	}
	@Test
	public void test1800() {
		double resultado = calcDesconto.aplicarDesconto(1800.0);
		Assert.assertEquals(1800.0, resultado, 0.0);
	}
	
	@Test
	public void test1801() {
		double resultado = calcDesconto.aplicarDesconto(1801.0);
		Assert.assertEquals(1710.95, resultado, 0.000001);
	}
	
	@Test
	public void test2000() {
		double resultado = calcDesconto.aplicarDesconto(2000.0);
		Assert.assertEquals(1900.0, resultado, 0.0);
	}
	
	@Test
	public void test2399() {
		double resultado = calcDesconto.aplicarDesconto(2399.0);
		Assert.assertEquals(2279.05, resultado, 0.000001);
	}
	
	@Test
	public void test2400() {
		double resultado = calcDesconto.aplicarDesconto(2400.0);
		Assert.assertEquals(2280.0, resultado, 0.0);
	}
	
	@Test
	public void test2401() {
		double resultado = calcDesconto.aplicarDesconto(2401.0);
		Assert.assertEquals(1872.78, resultado, 0.0);
	}
	
	@Test
	public void test3000() {
		double resultado = calcDesconto.aplicarDesconto(3000.0);
		Assert.assertEquals(2340.0, resultado, 0.0);
	}
	
	@Test
	public void test3599() {
		double resultado = calcDesconto.aplicarDesconto(3599.0);
		Assert.assertEquals(2807.22, resultado, 0.000001);
	}
	
	@Test
	public void test3600() {
		double resultado = calcDesconto.aplicarDesconto(3600.0);
		Assert.assertEquals(2808.0, resultado, 0.0);
	}
	
	@Test
	public void test3601() {
		double resultado = calcDesconto.aplicarDesconto(3601.0);
		Assert.assertEquals(2448.68, resultado, 0.0);
	}
	
	@Test
	public void test4000() {
		double resultado = calcDesconto.aplicarDesconto(4000.0);
		Assert.assertEquals(2720.0, resultado, 0.000001);
	}
}
