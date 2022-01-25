package prueba.ejercicio10;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date  = new Date();
		Empleado empleado = new Empleado("Alexander", "Lozano", 28, "1075246879", "MASCULINO", "Desarrollador Web", "Ingeniero de Software", "Universidad Surcolombiana", "T.I", (double) 5000, new Date(date.getYear(), date.getMonth(), date.getDay()));
		System.out.println(empleado.toString());
	}

}
