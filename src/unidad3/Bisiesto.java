package unidad3;
import java.util.Scanner;



public class Bisiesto {
	/*En el método main de una clase llamada Bisiesto escribe un programa que
utilizando una única expresión lógica determine si un año es o no es bisiesto. El
año se introducirá por teclado y el resultado lo mostrará en la pantalla. Un año
es bisiesto si es múltiplo de 4. Los años múltiplos de 100 no son bisiestos, salvo
si son múltiplos de 400*/

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa el año.");
		
		int año;
		
		año = in.nextInt();

		
		if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
			System.out.println("¡El año es bisiesto!");
		}
		
		else {
			System.out.println("¡El año no es bisiesto!");
			in.close();
		}
			
	}
}
		
		
		