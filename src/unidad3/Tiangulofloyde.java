package unidad3;
import java.util.Scanner;

public class Tiangulofloyde {

	public static void main(String[] args) {
		        int numeroFilas = 0;   
		        
		        Scanner lector = new Scanner(System.in);
		        
		        System.out.print("�Cu�ntas filas tiene el tri�ngulo? ");
		        numeroFilas = lector.nextInt();
		        
		        int contador = 0; // Los n�meros del tri�ngulo

		        for (int i = 1; i <= numeroFilas; i++)  // Recorre las filas
		        {
		            for(int j = 1; j <= i; j++)  // Recorre cada elemento de la fila
		            {
		                contador++;
		                System.out.print("  " + contador); 
		               // Imprime el n�mero actual en pantalla.
		            }
		            System.out.println("");  // Salto a la siguiente fila
		        }
	}
}
