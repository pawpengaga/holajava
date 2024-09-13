package semana1;
import java.util.Scanner;

public class Hola {

	// El metodo define el comportamiento de la clase
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Escribe tu nombre ");
			String nombre = sc.nextLine();
			System.out.println("Hola " + nombre + ", dime tu edad");
			int edad = sc.nextInt();
			System.out.println("Tu edad es: " + edad);
			// El printf es como en C !!!
			System.out.printf("Tu nombre es %s y tienes %d anios", nombre, edad);
		}	
	}
}