package prueba.ejercicio10;

public class Cargo extends Persona {
	
	private String cargo;
	private String titulo;
	private String universidad;
	private String area;
	
	public Cargo() {
		
	}
	
	public Cargo(String cargo, String titulo, String universidad, String area) {
		super();
		this.cargo = cargo;
		this.titulo = titulo;
		this.universidad = universidad;
		this.area = area;
	}

	public Cargo(String nombre, String apellido, int edad, String identificacion, String genero, String cargo, String titulo, String universidad, String area) {
		super(nombre, apellido, edad, identificacion, genero);
		this.cargo = cargo;
		this.titulo = titulo;
		this.universidad = universidad;
		this.area = area;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Cargo [cargo=" + cargo + ", titulo=" + titulo + ", universidad=" + universidad + ", area=" + area + "  " + super.toString() + "]";
	}
	
	
	
}
