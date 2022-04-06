package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.time.LocalDate;

public class Ticket extends Balanza{
	private java.time.LocalDate fecha = LocalDate.now();

	public Ticket(int unaCantidadDeProductos, double unPesoTotal, double unPrecioTotal){
		super(unaCantidadDeProductos, unPesoTotal, unPrecioTotal);
	}
	
	public double Impuesto() {
		double imp = 0.21;
		double tot = super.getPrecioTotal() * imp;
		
		return tot;
	}
	
	public java.time.LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}

	
	@Override
	public String toString() {
		String aux = " Fecha: "+getFecha()
					+" Cantidad de productos: "+super.getCantidadDeProductos()
					+" Peso total de los productos: "+super.getPesoTotal()
					+" Precio total de los productos: "+(super.getPrecioTotal()+Impuesto()) 
					+" Impuesto agregado: "+Impuesto();
		
		return aux;
	}
}
