package ar.edu.unlp.info.oo1._ejercicio8;
import java.util.ArrayList;

public class Distribuidora {
	private double precioKWh;
	private ArrayList<Usuario> usuarios = new ArrayList<>();
	
	
	public void agregarUsuario(Usuario u) {
		this.usuarios.add(u);
	}
	
	public double getPrecioKWh() {
		return precioKWh;
	}

	public void setPrecioKWh(double precioKWh) {
		this.precioKWh = precioKWh;
	}
	
	
}
