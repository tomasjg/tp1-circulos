package ar.edu.unlam.tp1;

public class Circulo {
	private double radio;
	private double perimetro;
	private double area;

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

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
	
	public void calcularArea(){
		this.area = Math.PI * Math.pow(this.radio, 2);  
	}
	
}
