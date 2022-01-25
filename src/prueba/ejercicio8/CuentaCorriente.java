package prueba.ejercicio8;

import java.math.BigDecimal;

public class CuentaCorriente {
	
	private String nombre;
	private String apellidos;
	private int edad;
	private String numeroCuenta;
	private BigDecimal saldo;
	private final BigDecimal cantidad = BigDecimal.valueOf(1);
	
	public CuentaCorriente() {
		
	}

	public CuentaCorriente(String numeroCuenta, BigDecimal saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public CuentaCorriente(String nombre, String apellidos, int edad, String numeroCuenta, BigDecimal saldo) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public BigDecimal ingresar() {
		if (saldo.compareTo(cantidad) > 0) {
			saldo.subtract(cantidad);
		}
		return saldo;
	}
	
	public BigDecimal reintegro() {
		if (saldo.compareTo(cantidad) > 0) {
			saldo.add(cantidad);
		}
		return saldo;
	}
	
	public String textInformacion()  {
		return "adjunte el número de cuenta y el saldo.";
	}

	public String toString() {
		return "CuentaCorriente [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", numeroCuenta="
				+ numeroCuenta + ", saldo=" + saldo + "]";
	}

	
	
}
