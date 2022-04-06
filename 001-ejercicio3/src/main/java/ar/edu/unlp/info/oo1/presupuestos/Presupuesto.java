package ar.edu.unlp.info.oo1.presupuestos;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	
	private List<Item> lista = new ArrayList <Item>();
	
	
	public String getCliente() {
		return cliente;
	}
	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
	public java.time.LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void agregarItem(Item item){
		this.lista.add(item);
	}
	
	public double calcularTotal(){
		return this.lista.stream().mapToDouble(lista -> lista.Costo()).sum(); // a cada uno de los items de la coleccion le aplico la siguiente funcion
	}																		 // el stream es como el for
	
	
	/*public double calcularTotal(){
		double tot = 0;
		for (Item item : lista) {
			tot = tot + item.Costo(); 
		}
		return tot;
	}
	*/
}
