package ar.edu.unlp.info.oo1._ejercicio7;

public class mainEmpleados {

	public static void main(String[] args) {
		

		//Gerente alan = new Gerente("Alan Turing");
		//double aportesDeAlan = alan.aportes();
		
		Gerente alan = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan.sueldoBasico(); //empeladoJerarquico.sueldoB(empleado.sueldoB(empleado.montoBasico()+empleado.aportes())+bonoPorCategoria())
		
		System.out.println(sueldoBasicoDeAlan);
		//System.out.println(aportesDeAlan);
	}

}
