package prueba.ejercicio10;

public class Persona extends Humano {

	private String nombre;
	private String  apellido;
	private int edad;
	private String identificacion;
	private String genero;
	
	public Persona() {
		
	}

	public Persona(String nombre, String apellido, int edad, String identificacion, String genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.identificacion = identificacion;
		this.genero = genero;
	}
	
	public Persona(int brazos, int cabeza, int piernas, int pies, String nombre, String apellido, int edad, String identificacion, String genero) {
		super(brazos, cabeza, piernas, pies);
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.identificacion = identificacion;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", identificacion="
				+ identificacion + ", genero=" + genero + " " + super.toString() + "]";
	}
	
}
