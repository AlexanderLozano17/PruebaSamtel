package prueba.ejercicio10;

import java.util.Date;

public class Empleado extends Cargo implements ComportamientoCargo {
	
	private Double salario;
	private Date fechaIngreso;

	public Empleado() {
		
	}	
	
	public Empleado(String nombre, String apellido, int edad, String identificacion, String genero, String cargo, String titulo, String universidad, String area, Double salario, Date fechaIngreso) {
		super(nombre, apellido, edad, identificacion, genero, cargo, titulo, universidad, area);
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
	}
	
	public Empleado(String cargo, Double salario, Date fechaIngreso) {
		super();
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pensar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void humano(int pies, int piernas, int cabeza, int brazos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	@Override
	public void escuchar() {
		// TODO Auto-generated method stub

	}


	public String toString() {
		return "Empleado [salario=" + salario + ", fechaIngreso=" + fechaIngreso + "  " + super.toString() + "]";
	}

	@Override
	public void accionCargo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delegaFuncion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RespondeA() {
		// TODO Auto-generated method stub
		
	}

}
