package unidad2;

import java.util.Scanner;

public class Sueldo {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Sueldo base: ");
			float sueldo = in.nextFloat();
			System.out.print("Importe de la primera venta: ");
			float venta1 = in.nextFloat();
			System.out.print("Importe de la segunda venta: ");
			float venta2 = in.nextFloat();
			System.out.print("Importe de la tercera venta: ");
			float venta3 = in.nextFloat();
			float comision = (venta1 + venta2 + venta3) * 0.1f;
			System.out.printf("Comisión por ventas: %.2f\nSueldo total: %.2f\n", comision, sueldo + comision);
		}

	}


