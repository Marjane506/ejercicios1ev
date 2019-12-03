package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		

		System.out.println("Quieres jugar a adivinar un número? (0=no,1=sí)");
		while (in.nextInt() == 1) {

			int max;
			max = r.nextInt(99001) + 1000;
			int n;
			n = r.nextInt(max) + 1;
			int nu;
			do {
				System.out.printf("¿Que número estoy pensando entre 1 y %d?", max, n);
				nu = in.nextInt();
				if (n > nu)
					System.out.println("El número que estoy pensando es mayor ");

				else if (n < nu)
					System.out.println("El número que estoy pensando es menor");

			} while (n != nu);
			System.out.println("Felicidades, has acertado.");
			in.close();

		}
	}
}
