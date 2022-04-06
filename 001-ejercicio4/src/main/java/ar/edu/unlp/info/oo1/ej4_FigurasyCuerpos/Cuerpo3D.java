package ar.edu.unlp.info.oo1.ej4_FigurasyCuerpos;

public class Cuerpo3D {
	private double altura;
	private double volumen;
	private Figura caraBasal;
	private double superficieExterior;
	
	
	public double getSuperficieExterior(){
		this.superficieExterior = 2 * caraBasal.getArea() + caraBasal.getArea() * this.altura;
		return superficieExterior;
	}
	
	public void setSuperficieExterior(double superficieExterior) {
		this.superficieExterior = superficieExterior;
	}
	
	public double getVolumen() {
		this.volumen = this.caraBasal.getArea() * this.altura;		//es util hacer los modulos que hice de mas?
		
		return volumen;
	}
	
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public double getCaraBasal(Circulo ci) {
		return ci.getArea();
	}

	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
}
