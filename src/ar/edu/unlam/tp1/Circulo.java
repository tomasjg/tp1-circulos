package ar.edu.unlam.tp1;

public class Circulo {
	private double radio;
	private double perimetro;

	public Circulo (double radio){
		this.radio = radio;
	}
	
	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void calcularPerimetro(){
		this.perimetro = 2 * Math.PI * this.radio;  
	}
	
}
