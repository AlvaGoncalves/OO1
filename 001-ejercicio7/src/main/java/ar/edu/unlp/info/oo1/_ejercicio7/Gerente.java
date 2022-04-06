package ar.edu.unlp.info.oo1._ejercicio7;

public class Gerente extends EmpleadoJerarquico{
	
	public Gerente(String unNombre) {
		super(unNombre);
	}

	public double montoBasico() {
		return 57000;
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05d;
	}
}
