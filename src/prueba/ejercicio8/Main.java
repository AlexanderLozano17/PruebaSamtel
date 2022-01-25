package prueba.ejercicio8;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String[] args) {
						
		double saldoCorriente = 100000;
		BigDecimal nuevoSaldo;
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente("alexander", "lozano", 28, "1547795656", new MetodoAuxiliar().bigDecimal(saldoCorriente));
		nuevoSaldo = cuentaCorriente.ingresar();
		cuentaCorriente.setSaldo(nuevoSaldo);
		System.out.println(cuentaCorriente.toString());	
		
		System.out.println("*****************************************************************");
		
		double saldoAhorro = 200000;
		double interes = 10;
		BigDecimal calculoInteres;
		
		CuentaAhorro cuentaAhorro = new CuentaAhorro(interes, "1458545488", new MetodoAuxiliar().bigDecimal(saldoAhorro));
		cuentaAhorro.setNombre(cuentaCorriente.getNombre());
		cuentaAhorro.setApellidos(cuentaCorriente.getApellidos());
		cuentaAhorro.setEdad(cuentaCorriente.getEdad());
		cuentaAhorro.setInteres(15);
		calculoInteres = cuentaAhorro.calculaInteres();
		

		System.out.println(cuentaAhorro.toString());
		System.out.println("Calculo de intereses: " + calculoInteres);
		
	}
}
