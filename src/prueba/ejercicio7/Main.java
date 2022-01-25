package prueba.ejercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		String frase = null;
		
		System.out.println("Ingresa alguna frase: ");
		frase = scanner.nextLine();
		
		if (frase.length() > 2) {
			System.out.println("****************************");
			System.out.println("caracteres en minúsculas:  " + frase.toLowerCase());
			System.out.println("caracteres en mayúsculas: " + frase.toUpperCase());
			System.out.println("Los 2 primeros caracteres de la cadena:  " + frase.substring(0, 2));
			System.out.println("Los 2 últimos caracteres de la cadena " + frase.substring(frase.length()-2, frase.length()));
			
			
			char caracter = frase.charAt(frase.length()-1);
			MetodosAuxiliares metodos = new MetodosAuxiliares();
			System.out.println("número de ocurrencias en la cadena del último carácter |" + caracter + "|: " + metodos.contarCaracteres(frase, caracter));
			 
			String frase2 = "***" + frase + "***";
			System.out.println("cadena con 3 asteriscos por delante y 3 asteriscos por detrás: " + frase2);
			System.out.println("La cadena invertida: " + metodos.stringInverso(frase));

		} else {
			System.out.println("Es necesario que la frase contenga mas de 3 caracteres");
		}
		
	}

}
