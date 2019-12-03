package unidad3;
import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);
				Random r = new Random();
				int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
				
				System.out.println("Numero de tiradas:");
				int tiradas = in.nextInt();
				for (int i=0; i<tiradas; i++) {
					switch (r.nextInt(6)) {
					case 0:
						n1++;
						break;
					case 1:
						n2++;
						break;
					case 2:
						n3++;
						break;
					case 3:
						n4++;
						break;
					case 4:
						n5++;
						break;
					case 5:
						n6++;
						break;
					}
				}
				mostrarResultados(1, n1);
				mostrarResultados(2, n2);
				mostrarResultados(3, n3);
				mostrarResultados(4, n4);
				mostrarResultados(5, n5);
				mostrarResultados(6, n6);
			}

			static void mostrarResultados(int n, int contador) {
				System.out.printf("Numero de veces que ha salido el %d: %d\n", n, contador);
			}
			

		
	}

