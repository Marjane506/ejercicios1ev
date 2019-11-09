package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Conversor {
	public static void main(String[] args)throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Euros:");
    System.out.printf("Dolares: %.2f", Float.parseFloat(in.readLine()) *1.11f);
			}
	}


