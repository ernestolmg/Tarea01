package com.senati.envio01;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Leer un número entero o decimal y mostrar su doble, 
		// triple, cuadrado y cubo.
		
		float numero = 0f;
		float doble_numero = 0f;
		float triple_numero = 0f;
		float cuadrado_numero = 0f;
		float cubo_numero = 0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce el lado a calcular -> ");
		numero = sc.nextFloat();
		
		
		doble_numero = 2 * numero;
		triple_numero = 3 * numero;
		cuadrado_numero = numero*numero;
		cubo_numero = numero*numero*numero;
		
		System.out.println("El doble del nùmero es : " + doble_numero);
		System.out.println("El triple del nùmero es : " + triple_numero);
		System.out.println("El cuadrado del nùmero es : " + cuadrado_numero);
		System.out.println("El cubo del nùmero es : " + cubo_numero);
	}

}
