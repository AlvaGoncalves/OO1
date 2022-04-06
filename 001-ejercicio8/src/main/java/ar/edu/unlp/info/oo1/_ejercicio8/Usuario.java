package ar.edu.unlp.info.oo1._ejercicio8;
import java.util.ArrayList;

public class Usuario {

	private String domicilio;
	private String nombre;
	private ArrayList<Consumo> medicion = new ArrayList<>();
	private ArrayList<Factura> facturas = new ArrayList<>();
	
	public void agregarMedicion(Consumo C) {
		this.medicion.add(C);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}

}
