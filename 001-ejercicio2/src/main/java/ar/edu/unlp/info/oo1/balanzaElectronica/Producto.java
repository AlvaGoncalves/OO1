package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	public Producto(double unPeso, double unPrecioPorKilo, String unaDescripcion){
		unPeso = peso;
		unPrecioPorKilo = precioPorKilo; 
		unaDescripcion = descripcion;
	}
	
	public Producto() {
		
	}
	
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public double getPrecio(){
		return this.peso * this.precioPorKilo;
	}
	
	
}
