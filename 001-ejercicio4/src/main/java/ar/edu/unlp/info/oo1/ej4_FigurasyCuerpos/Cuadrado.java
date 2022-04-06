package ar.edu.unlp.info.oo1.ej4_FigurasyCuerpos;

public class Cuadrado implements Figura{
	private double lado;
	private double perimetro;
	private double area;
	

	
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = this.lado * this.lado;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro() {
		this.perimetro = lado * 4;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
}
