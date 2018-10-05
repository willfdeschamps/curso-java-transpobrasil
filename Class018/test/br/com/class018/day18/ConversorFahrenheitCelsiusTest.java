package br.com.class018.day18;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversorFahrenheitCelsiusTest {
	ConversorFahrenheitCelsius conversor;
	
	@Before
	public void before() {
		conversor = new ConversorFahrenheitCelsius();
	}
	@Test
	public void testZeroCelsiusParaHarenheit() {
		double resultado = conversor.converteParaFahrenheit(0.0);
		Assert.assertEquals(32.0, resultado, 0.0);
	}
	
	@Test
	public void testMenos10CelsiusParaHarenheit() {
		double resultado = conversor.converteParaFahrenheit(-10.0);
		Assert.assertEquals(14.0, resultado, 0.0);
	}
	
	@Test
	public void tesMais10CelsiusParaHarenheit() {
		double resultado = conversor.converteParaFahrenheit(10.0);
		Assert.assertEquals(50.0, resultado, 0.0);
	}
	
	@Test
	public void testMais1CelsiusParaHarenheit() {
		double resultado = conversor.converteParaFahrenheit(1.0);
		Assert.assertEquals(33.8, resultado, 0.0);
	}
	
	@Test
	public void testZeroFahrennheitParaCelsius() {
		double resultado = conversor.converteParaCelsius(0.0);
		System.out.println(resultado);
		Assert.assertEquals(-17.7778, resultado, 0.0001);
	}
	
	@Test
	public void testMenos10FahrennheitParaCelsius() {
		double resultado = conversor.converteParaCelsius(-10.0);
		Assert.assertEquals(-23.3333, resultado, 0.0001);
	}
	
	@Test
	public void testMais10FahrennheitParaCelsius() {
		double resultado = conversor.converteParaCelsius(10.0);
		Assert.assertEquals(-12.2222, resultado, 0.0001);
	}
	
	@Test
	public void testMais1FahrennheitParaCelsius() {
		double resultado = conversor.converteParaCelsius(1.0);
		Assert.assertEquals(-17.2222, resultado, 0.0001);
	}
	
	@Test
	public void testMais100FahrennheitParaCelsius() {
		double resultado = conversor.converteParaCelsius(100.0);
		Assert.assertEquals(37.7778, resultado, 0.0001);
	}
	
	@Test
	public void testMais32FahrennheitParaCelsius() {
		double resultado = conversor.converteParaCelsius(32.0);
		Assert.assertEquals(0.0, resultado, 0.0);
	}
}
