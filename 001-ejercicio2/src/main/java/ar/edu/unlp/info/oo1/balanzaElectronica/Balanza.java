package ar.edu.unlp.info.oo1.balanzaElectronica;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> lista = new ArrayList<Producto>();
	
	
	public Balanza(int unaCantidadDeProductos, double unPrecioTotal, double unPesoTotal) {
		this.cantidadDeProductos = unaCantidadDeProductos;
		this.precioTotal = unPrecioTotal;
		this.pesoTotal = unPesoTotal;
	}
	
	public Balanza() {
		
	}
	
	public String getProductos(){
		lista.stream().forEach();//me da de a uno los elementos
		//lista.stream().
		
		return lista.toString();
	}
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
		
		//lista.stream().mapToDouble(Producto -> Producto.setPeso(0));
	}
	
	public void agregarProducto(Producto p) {
		this.cantidadDeProductos++;
		this.precioTotal = this.precioTotal + p.getPrecio();
		this.pesoTotal = this.pesoTotal + p.getPeso();
		
		this.lista.add(p);
	}
	
	public Ticket emitirTicket(){
		return new Ticket(this.cantidadDeProductos,this.precioTotal,this.pesoTotal);
		
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	
	
	
	
	
	
}
