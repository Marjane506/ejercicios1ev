package unidad3;
/*En el método main de una clase llamada Hora escribe un programa que lea una
hora (horas, minutos y segundos) desde el teclado y muestre en la pantalla la
hora correspondiente al segundo siguiente. Realiza la lectura de los datos de
entrada como estimes oportuno*/

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		
	 Scanner in = new Scanner(System.in);
	 System.out.print("Hora: ");
	 
	 int hora = in.nextInt();
			System.out.print("Minutos: ");
			
			int minutos = in.nextInt();
			System.out.print("Segundos: ");
			
			int segundos = in.nextInt();
			segundos++;
			
			if (segundos > 59) {
				segundos = 0;
				minutos++;
				
				if (minutos > 59) {
					minutos = 0;
					hora++;
					if (hora > 23)
						
						hora = 0;
				}
			}
			System.out.println(hora + ":" + minutos + ":" + segundos);
			
			in.close();
		}

	}

