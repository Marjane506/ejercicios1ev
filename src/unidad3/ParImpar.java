package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�Par o Impar?");
		
		int num = in.nextInt();
		

		if (num % 2 == 0) {

			System.out.println(num + " es un n�mero Par.");
		}

		else {

			System.out.println(num + " es un n�mero Impar");

			in.close();
		}

	}

}
