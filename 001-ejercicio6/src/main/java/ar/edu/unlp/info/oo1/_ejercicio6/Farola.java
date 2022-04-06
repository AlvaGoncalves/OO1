package ar.edu.unlp.info.oo1._ejercicio6;
import java.util.ArrayList;

public class Farola {
	private ArrayList<Farola> conexiones = new ArrayList<Farola>();
	private boolean encendida = false;
	
	public Farola(){
	
	}
	
	public ArrayList<Farola> getNeighbors() {
		return conexiones;
	}
	public void pairWithNeighbor(Farola unaFarola) {
		this.conexiones.add(unaFarola);
		unaFarola.addFarola(this); //le agrego la farola a mi farola (vecinas)
	}
	public void addFarola(Farola farola) {
		conexiones.add(farola);
	}

	
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}
	
	public void turnOn() {
		if(this.isOn() == false) {
			this.conexiones.stream().forEach(Farola -> Farola.setEncendida(true));
		}
	}
	
	public void turnOff() {
		if(this.isOn() == true) {
			this.conexiones.stream().forEach(Farola -> Farola.setEncendida(false));
		}
	}
	public boolean isOn() {
		return this.encendida; // me devuelve false siempre, por que?
	}
	
}
