package ar.edu.unlp.info.oo1._ejercicio8;
import java.math.*;
import java.time.LocalDate;

public class Consumo {
	private java.time.LocalDate fecha = LocalDate.now();
	private double consumoEA;
	private double consumoER;

	
	public double costoEnBaseA(double precioKWh) {
		if(factorDePotencia() > 0.8) {
			return this.consumoEA * precioKWh + bono(precioKWh);
		}else {
			return this.consumoEA * precioKWh;
		}
	}
	
	public double factorDePotencia() {
		return (this.consumoEA / (this.consumoEA * this.consumoEA) + (this.consumoER * this.consumoER));
	}
	
	public double bono(double precioKWh) {
		return (this.consumoEA * precioKWh) * 0.10;
	}
	
	public java.time.LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getConsumoEA() {
		return consumoEA;
	}
	public void setConsumoEA(double consumoEA) {
		this.consumoEA = consumoEA;
	}
	public double getConsumoER() {
		return consumoER;
	}
	public void setConsumoER(double consumoER) {
		this.consumoER = consumoER;
	}

	
	
	
}
