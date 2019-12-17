package com.senati.envio01;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lea una cantidad en nuevos soles y obtenga su equivalencia
		// en euros. Debe leer también el tipo de cambio del día 
		// (es decir, a cuánto equivale un euro en nuevos soles)
		
		float cant_dinero = 0f;	
		float euro_sol = 0f;
		float camb_sol = 0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce el monto en soles -> ");
		cant_dinero = sc.nextFloat();
		System.out.print("introduce el cambio del euro a soles -> ");
		euro_sol = sc.nextFloat();
		
		camb_sol = cant_dinero / euro_sol;
		
		System.out.println("El dinero en euros será : " + camb_sol);
		
		
	}

}
