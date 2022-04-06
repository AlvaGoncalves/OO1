package ar.edu.unlp.info.oo1.ej4_FigurasyCuerpos;

public class Circulo implements Figura {
	private double diametro;
	private double radio;
	private double perimetro;
	private double area;
	
	
	//constructor?
	
	public double getArea() {
		this.area = Math.PI * Math.pow(area, 2);
		return area;
	}
	
	public void setArea(double area) { //de mas?
		this.area = area;
	}
	public double getPerimetro() { //deberia ir en el get?
		this.perimetro = Math.PI * this.diametro;
		return perimetro;
	}
	public void setPerimetro(double perimetro) { //de mas? 
		this.perimetro = perimetro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getDiametro() {
		this.diametro = this.radio*2;
		
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	
	
	
}
