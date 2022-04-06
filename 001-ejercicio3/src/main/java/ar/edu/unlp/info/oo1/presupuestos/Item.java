package ar.edu.unlp.info.oo1.presupuestos;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	/*public Item(String unDetalle, int unaCantidad, double unCostoU){
		this.detalle = unDetalle;
		this.cantidad = unaCantidad;
		this.costoUnitario = unCostoU;
	}
	*/
	public String getDetalle() {
		return detalle;
	}
	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}
	public int getCantidad() {
		return cantidad;
	}
	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}
	
	/*public double Costo() {
		return this.getCostoUnitario() * this.getCantidad();		por que asi no?
	}
	*/
	
	public double Costo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
