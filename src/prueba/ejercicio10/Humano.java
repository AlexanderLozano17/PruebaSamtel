package prueba.ejercicio10;

public class Humano implements ComportamientoHumano{

	private int brazos;
	private int cabeza;
	private int piernas;
	private int pies;
	
	public Humano() {
	}

	public Humano(int brazos, int cabeza, int piernas, int pies) {
		this.brazos = brazos;
		this.cabeza = cabeza;
		this.piernas = piernas;
		this.pies = pies;
	}

	public int getBrazos() {
		return brazos;
	}

	public void setBrazos(int brazos) {
		this.brazos = brazos;
	}

	public int getCabeza() {
		return cabeza;
	}

	public void setCabeza(int cabeza) {
		this.cabeza = cabeza;
	}

	public int getPiernas() {
		return piernas;
	}

	public void setPiernas(int piernas) {
		this.piernas = piernas;
	}

	public int getPies() {
		return pies;
	}

	public void setPies(int pies) {
		this.pies = pies;
	}

	public String toString() {
		return "Humano [brazos=" + brazos + ", cabeza=" + cabeza + ", piernas=" + piernas + ", pies=" + pies + "]";
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
	
	
}
