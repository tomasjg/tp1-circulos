package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {
	private double precision = 0.01;	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circulo = new Circulo(2);
		 assertEquals(2, circulo.getRadio(), precision);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circulo = new Circulo(3.7);
		assertEquals(3.7, circulo.getRadio(), precision);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circulo = new Circulo(5);
		assertEquals(5, circulo.getRadio(), precision);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circulo = new Circulo(10.9);
		assertEquals(10.9, circulo.getRadio(), precision);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61Punto57() {
		Circulo circulo = new Circulo(9.8);
		circulo.calcularPerimetro();		
		assertEquals(61.57, circulo.getPerimetro(), precision);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6Es104Punto30() {
		Circulo circulo = new Circulo(16.6);
		circulo.calcularPerimetro();		
		assertEquals(104.30, circulo.getPerimetro(), precision);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
		Circulo circulo = new Circulo(9.8);		
		circulo.calcularArea();		
		assertEquals(301.71, circulo.getArea(), precision);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69() {
		Circulo circulo = new Circulo(16.6);
		circulo.calcularArea();		
		assertEquals(865.69, circulo.getArea(), precision);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
