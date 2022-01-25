package prueba.ejercicio8;

import java.math.BigDecimal;

public class CuentaAhorro extends CuentaCorriente {

	private double interes;
	
	public CuentaAhorro() {
		
	}
	
	public CuentaAhorro(double interes, String numeroCuenta, BigDecimal saldo) {
		super(numeroCuenta, saldo);
		this.interes = interes;
		
	}
	
	public CuentaAhorro(String numeroCuenta, BigDecimal saldo) {
		super(numeroCuenta, saldo);
		this.interes = (15.3/100);
	}
	
	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = (interes/100);
	}

	public BigDecimal calculaInteres() {
		if (getSaldo().compareTo(BigDecimal.ZERO) > 0) {
			BigDecimal saldo = getSaldo().multiply(BigDecimal.valueOf(interes));
			return saldo;
		}
		return null;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [interes=" + interes + ", toString()=" + super.toString() + "]";
	}

}
