package prueba.ejercicio7;

public class MetodosAuxiliares {

	/**
	 * 
	 * @param cadena
	 * @param caracter
	 * @return
	 */
	public int contarCaracteres (String cadena, char caracter) {
		int contador = 0;
		for (int i = 0; i<cadena.length(); i++) {
			char caracterActual = cadena.charAt(i);
			if (caracter == caracterActual) {
				contador++;
			}
		}
		return contador;
		
	}
	
	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public String stringInverso (String cadena) {
		StringBuilder fraseInversa = new StringBuilder();
		for (int i = (cadena.length() - 1); i >= 0; i--){
			fraseInversa.append(cadena.charAt(i));
		}
		return fraseInversa.toString();
	}
}
